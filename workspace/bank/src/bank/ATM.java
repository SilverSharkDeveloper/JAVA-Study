package bank;

import java.util.Scanner;




//잘못눌렀을시 돌아가는 버튼이없다 이걸 구현하는 방법
//instancof 사용시 사용자가 입력한 번호로 클래스를 분기하는 방법이 있나? ->타입을 변수로 받는방법이 있는가,,?
//100명제한 -> 해결
//핸드폰번호로 계좌번호를 새로 생성해 대입하는이유? 그냥 계좌뽑아주면 되지않나
//만약에 다른방법이 있다면 객체를 전달받지않고 가능한가,,?
//만약 중복검사같은 메소드를 화면에서 구현하려고한다면 가능한지??

//계속 반복되는 화면단에 중복검색이나 계좌찾는 기능은 메소드로 구현이 가능한가?

//비밀번호 변경 만들어보기


//만약에 계좌번호, 폰넘버,비밀번호 모두 존재하면 Bank객체 반환 존재안하면 null 로 메소드를 만들어
//중복값이 있으면 안될때 -> 계좌생성 -> check acount로 반환받은 주소값이 null이면 개설
//중복값이 있어야 할때 -> 입금시 ->은행계좌 조회 -> 그 객체의 주소값 반환 (null이 아니면으로 분기처리)
//로그인 메소드 -> 계좌로 반환받은 객체, 비밀번호로 반환받은 객체의 주소값이 같다면 로그인성공 아니라면실패(tempBank 변수를 두개써야함)

//


public class ATM {
	public static void main(String[] args) {
		Bank [][] arrBank = new Bank[3][100];
		int[] arCount = new int[3];
		
		Scanner sc = new Scanner(System.in);
	
		
		
		
		int choiceBank = 0 , choiceMenu = 0, flag = 0;
		String msg1 = "은행을 선택해 주세요 \n1.카카오\n2.국민\n3.신한\n4.종료";
		String msg2 = "원하시는 서비스를 선택해 주세요. \n1.계좌개설\n2.입금하기\n3.출금하기\n4.잔액조회"
				+ "\n5.계좌번호 찾기\n6.비밀번호변경\n7.은행선택메뉴로 돌아가기";
	
		
		while(true) {
		System.out.println(msg1);
		
		choiceBank = sc.nextInt();
		
		if(choiceBank ==4) {break;}  //종료
		if(choiceBank <1 || choiceBank >4) {
			System.out.println("잘못 입력하셨습니다. 종료합니다");
			break;
		}
			flag = 0; //탈출플래그 초기화
		
		while(true) {
			if(flag==7) {break;} //7번선택시 탈출
			
		System.out.println(msg2);
		choiceMenu = sc.nextInt();
	
		//비교할 변수 리셋
		int tempAccount = 0 , tempMoney = 0;
		String tempPhoneNumber = "" , tempPassword = "";
		Bank tempBank = null;
		
		
		
		
			switch(choiceMenu) {
			
				
			
			case 1: 			//계좌 개설
				Bank[] arBank = {new Kakao() , new Kookmin(), new Sinhan()};
				Bank newBank = arBank[choiceBank-1]; //사용자가 선택한 뱅크객체 생성해 업캐스팅해서 담기
				String BankName = "";
					
				//100칸이 넘을경우 스위치문 탈출 시켜주는 코드
				switch(choiceBank) {
				case 1 : BankName = "kakao";
					break;
				case 2 :  BankName = "Kookmin";
					break;
				case 3 :BankName = " Sinhan";
					break;
				}
				
				if(arCount[choiceBank-1]>100) {
					System.out.println(BankName + "은행에 계좌가 이미 한도초과라 계좌생성이 불가능 합니다.");
					break;
					}
						
		//=======================================================================
							
							//한번은 무조건 랜덤생성 필요 -> 조건식 검사 ->계좌생성
							do {
							tempAccount =Bank.getAccount();
							}while(!(Bank.checkAcount(arrBank,tempAccount)));
							
							newBank.account=tempAccount;
							
	//=======================================================================
							
							System.out.println("이름을 입력해주세요");
							newBank.name = sc.next();
							
	//=======================================================================
						
							System.out.println("전화번호 입력해주세요 \n 예) 010-0000-0000");
						
							//두조건 모두 아닐경우 탈출
							//만약에 세번이상 잘못입력시 처음으로 돌아가고싶다면?? ->flag설정
							
							while(true) {
							tempPhoneNumber = sc.next();	
							
							if(tempPhoneNumber.length()!=13) {
								System.out.println("전화번호를 예시와 같이 정확하게 입력해주세요\n 예)010-0000-0000");
							}else if(!(Bank.checkPhoneNumber(arrBank, tempPhoneNumber))) {
								System.out.println("중복된 전화번호가 존재합니다. 다시 입력해주세요");
							}else {
								break;
							}
							}
							
							newBank.phoneNumber = tempPhoneNumber;
							//=======================================================================
						
							System.out.println("사용하실 비밀번호 4자리를 입력해주세요");
							//4자리확인
							while(true) {
							tempPassword = sc.next();
							if(tempPassword.length()!=4) {
								System.out.println("비밀번호 4자리를 정확하게 입력해주세요");
							}else {
								break;
							}
							
							}
							//=======================================================================
							newBank.password = tempPassword;
							
							
							arrBank[choiceBank-1][arCount[choiceBank-1]] = newBank;
							
							arCount[choiceBank-1] ++;
							System.out.println("성공적으로 계좌를 생성하셨습니다.");
							System.out.println("당신의 계좌정보는" + newBank.toString() +"입니다");
							
				break;
				//=======================================================================
			case 2:				//입금
				System.out.println("입금하실 계좌의 계좌번호 6자리를 입력해주세요");
				while(true) {
					tempAccount =sc.nextInt();
					if(Bank.checkAcount(arrBank, tempAccount)) {
						System.out.println("입력하신 계좌가 존재하지않습니다. 다시입력해주세요");
					}else {
						break;
					}
				}
				System.out.println("계좌번호의 비밀번호 4자리를 입력해주세요");
				while(true) {
					tempPassword = sc.next();
					tempBank = (Bank.login(arrBank, tempAccount, tempPassword));
					if(tempBank!=null) {
						System.out.println("로그인 성공 ");
						break;
					}else {
						System.out.println("로그인 실패 비밀번호 4자리를 정확히 입력해 주세요");
					}
				}
				
				if(!(tempBank instanceof Kakao && choiceBank ==1 
						|| tempBank instanceof Kookmin && choiceBank ==2
						||tempBank instanceof Sinhan && choiceBank ==3)) {
						System.out.println("은행선택과 로그인하신 계좌은행이 다릅니다. 은행을 다시선택해 주세요");
						break;
				}
//조금이따구현		if(tempBank instanceof ) -> 뒤에 클래스명을 써야하는데 사용자가 선택한 번호의 클래스를 설정하는 방법
				
				
					System.out.println("입금할 금액을 입력해주세요");
					tempMoney = sc.nextInt();
					
					tempBank.deposit(tempMoney);
					
					System.out.println("입금성공하였습니다. 잔액은: " + tempBank.money +"입니다");
				
				//=======================================================================
				break;
			case 3:				//출금
				//=======================================================================
						System.out.println("출금하실 계좌의 계좌번호 6자리를 입력해주세요");
					while(true) {
						tempAccount =sc.nextInt();
						if(Bank.checkAcount(arrBank, tempAccount)) {
							System.out.println("입력하신 계좌가 존재하지않습니다. 다시입력해주세요");
						}else {
							break;
						}
					}
					//=======================================================================
					System.out.println("계좌번호의 비밀번호 4자리를 입력해주세요");
					while(true) {
						tempPassword = sc.next();
						tempBank = (Bank.login(arrBank, tempAccount, tempPassword));
						if(tempBank!=null) {
							System.out.println("로그인 성공 ->출금을 진행합니다");
							break;
						}else {
							System.out.println("로그인 실패 비밀번호 4자리를 정확히 입력해 주세요");
						}
					}
					
					if(!(tempBank instanceof Kakao && choiceBank ==1 
							|| tempBank instanceof Kookmin && choiceBank ==2
							||tempBank instanceof Sinhan && choiceBank ==3)) {
							System.out.println("은행선택과 로그인하신 계좌은행이 다릅니다. 은행을 다시선택해 주세요");
							break;
					}
					//=======================================================================
					
					System.out.println("출금할 금액을 적어주세요");
					
					while(true) {
					tempMoney = sc.nextInt();
					
					//최대로 뽑을 수 있는 금액 보여주기
					
					if(tempBank instanceof Kookmin) {
						if(tempBank.money - 1.5*tempMoney <0) {
							System.out.println("출금할 금액이 부족합니다. 다시 입력해주세요");
							System.out.println("최대로 뽑을 수 있는 금액은" + tempBank.money/3*2+"입니다");
						}else {
							tempBank.withdraw(tempMoney);
							break;
						}
					}else {
						if(tempBank.money - tempMoney <0) {
							System.out.println("출금할 금액이 부족합니다. 다시 입력해주세요");
							System.out.println("최대로 뽑을 수 있는 금액은 "+tempBank.money +"입니다");
						}else {
							tempBank.withdraw(tempMoney);
							break;
						}
							
					}
					}
					//=======================================================================
					System.out.println("출금에 성공하셨습니다. 잔액은 :" + tempBank.money + "입니다");
					
					
				break;
			case 4:				//잔액조회
							System.out.println("잔액을 조회할 계좌번호를 입력해 주세요");
							while(true) {
								tempAccount =sc.nextInt();
								if(Bank.checkAcount(arrBank, tempAccount)) {
									System.out.println("입력하신 계좌가 존재하지않습니다. 다시입력해주세요");
								}else {
									break;
								}
							}
							
							System.out.println("계좌번호의 비밀번호 4자리를 입력해주세요");
							while(true) {
								tempPassword = sc.next();
								tempBank = (Bank.login(arrBank, tempAccount, tempPassword));
								if(tempBank!=null) {
									System.out.println("로그인 성공 ->잔액을 조회합니다");
									break;
								}else {
									System.out.println("로그인 실패 비밀번호 4자리를 정확히 입력해 주세요");
								}
							}
							
							System.out.println("남은 잔액은 :" + tempBank.seeAccount() + "입니다");
							
				break;
			case 5:				//계좌번호 찾기
						System.out.println("전화번호를 입력해 주세요 \n 예) 010-0000-0000");
						
						
						
						while(true) {
						tempPhoneNumber = sc.next();
						if(tempPhoneNumber.length()!=13) {
							System.out.println("전화번호를 예시와 같이 정확하게 입력해주세요\n 예)010-0000-0000");
						}else if(Bank.checkPhoneNumber(arrBank, tempPhoneNumber)) {
							System.out.println("찾으시는 전화번호가 없습니다. 다시 입력해주세요");
						}else {
								tempBank = Bank.PhoneCheck(arrBank, tempPhoneNumber);
								break;
						}
						}
						
//						System.out.println("찾으시는 계좌번호는" + tempBank.account + "입니다"); ->폰번호와 일치하는 계좌번호
						
						do {
							tempAccount = Bank.getAccount();
							}while(!(Bank.checkAcount(arrBank,tempAccount)));
						
						tempBank.account = tempAccount;
						System.out.println("새로운 계좌:"+tempAccount + "가 발급되었습니다.");
				
				break;
			
			case 6 : 
					System.out.println("변경할 비밀번호의 계좌번호를 입력해 주세요");
				
					while(true) {
						tempAccount =sc.nextInt();
						if(Bank.checkAcount(arrBank, tempAccount)) {
							System.out.println("입력하신 계좌가 존재하지않습니다. 다시입력해주세요");
						}else {
							break;
						}
					}
					System.out.println("계좌번호의 기존 비밀번호 4자리를 입력해주세요");
					while(true) {
						tempPassword = sc.next();
						tempBank = (Bank.login(arrBank, tempAccount, tempPassword));
						if(tempBank!=null) {
							System.out.println("로그인 성공 ->바꿀 비밀번호를 입력해주세요");
							break;
						}else {
							System.out.println("로그인 실패 비밀번호 4자리를 정확히 입력해 주세요");
						}
					}
					
					
					while(true) {
						tempPassword = sc.next();
						if(tempPassword.length()!=4) {
							System.out.println("비밀번호 4자리를 정확하게 입력해주세요");
						}else {
							break;
						}
					}
					tempBank.password = tempPassword;
					System.out.println("비밀번호 변경에 성공하셨습니다.");
					
					
					
				
				break;
			
			case 7:				//은행선택으로 돌아가기
					flag =7;
				break;
			}
		}
		}
	}
	
	
}
