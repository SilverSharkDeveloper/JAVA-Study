package arrayListTask.User;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String mainMessage = "1.회원가입\n2.로그인";
		String mainMessage2 = "1.비밀번호 변경\n2.암호화";
		Scanner sc = new Scanner(System.in);
	
		
		while(true) {
		int choice = 0 ;
		String tempId = "";
		String tempPw = "";
		String tempPhoneNumber = "";
		String tempName = "";
		User user = null;
		String tempKeywords = "";
		
		System.out.println(mainMessage);
		
		choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			System.out.println("이름 : ");
			tempName = sc.next();
			
			System.out.println("전화번호 :");
			tempPhoneNumber = sc.next();

			System.out.println("본인 인증을 위한 인증번호를 전송합니다");
			
			String keywords = UserField.sendMessege(tempPhoneNumber);
		    
		
		       System.out.println("인증번호를 입력해 주세요");
		       tempKeywords=sc.next();
		       
		       if(!tempKeywords.equals(keywords)) {
		    	   System.out.println("인증번호가 틀렸습니다.");
		    	   break;
		       }
		       
		       
		       
					System.out.println("인증되었습니다.\n id 입력해주세요");
					tempId = sc.next();
					user = UserField.checkId(DBConnecter.db, tempId);
					if(user!=null) {
						System.out.println("중복된 id가 존재합니다.");
						break;
					}
					
					System.out.println("비밀번호 입력 : ");
					tempPw = sc.next();
					
					
					user = UserField.join(DBConnecter.db, tempName, tempId, tempPw, tempPhoneNumber);
					
					System.out.println("회원가입 성공");
					
					
					System.out.println("당신의 정보는: " + user.toString());
					
			break;
			
			
		case 2 :
					System.out.println("아이디 입력 : ");
					tempId = sc.next();
					System.out.println("비밀번호 입력 : ");
					tempPw = sc.next();
					user =UserField.login(DBConnecter.db, tempId, tempPw);
					if(user==null) {
						System.out.println("아이디 또는 비밀번호가 일치하지 않거나 없습니다.");
						break;
					}
					System.out.println("login 성공 마이페이지로 들어갑니다.");
					
					System.out.println(mainMessage2);
					
						choice = sc.nextInt();
						
						switch(choice) {
						case 1 :  
								System.out.println("변경할 비밀번호 입력 : ");
								tempPw = sc.next();
								UserField.changePw(user, tempPw);
								System.out.println("비밀번호 변경 성공");
								
							break;
							
						case 2 : 
								
								System.out.println("비밀번호를 암호화합니다");
								UserField.changePw(user, UserField.encript(user));
								System.out.println("암호화한 비밀번호는 : " + user.getPw());
								
							break;
							
						}
					
			break;
		}
		
	}
	}
}
