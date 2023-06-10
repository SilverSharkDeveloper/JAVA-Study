package lambdaTask2;

import java.util.Scanner;

public class MyMath {
	
	
	
	public static void main(String[] args) {
		//숫자를 담는 배열의 갯수가 -로 시작할땐 전체숫자의 갯수보다 한개 많다 ->첫번째 칸엔 빈문자열이담김->이유?
//				-> -도 구분점이기 때문에 앞에 빈문자열도 구분해서 담아준다.
		
		int result = 0;      //결과 값
		int buhocount = 0;     //부호 배열 칸수를 결정할 부호의 갯수
		int idx = 0;           //부호배열에 부호를 넣을 인덱스
		String [] arbuho = null;    //부호배열
		String [] numbers = null; //숫자 배열
		
		String msg = "계산하시고싶은 수식을 적어주세요!";
		
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		String sik = sc.next();
	
		//getopers ->if로 +- String 으로 붙인 다음 split("") 써서 배열로 리턴  -> 굳이 크기를 구할필요가 없다.
		
		OperCheck op = fullsik-> fullsik.split("\\+|\\-");  //숫자배열 리턴하는 람다식 
	
		
		numbers = op.getOpers(sik);
		
		
		//부호의 갯수 구하기
		for (int i = 0; i < sik.length(); i++) {
			if(sik.charAt(i)=='+'||sik.charAt(i)=='-') {buhocount++;}
		}
		
		//부호배열의 칸수 정의
		arbuho = new String[buhocount];
		
		//arbuho에 부호 넣기
		for (int i = 0; i < sik.length(); i++) {
			if(sik.charAt(i)=='+') {
				arbuho[idx] = "+";
				idx++;
			}else if(sik.charAt(i)=='-') {
				arbuho[idx] ="-";
				idx++;
			}
		}
		
//		1번 방법 부호가 -로 시작하는경우 -> 새로운 배열 두개 생성
//		if(numbers[0].equals("")) {
//			arbuho = Arrays.copyOfRange(arbuho, 1, arbuho.length);
//			numbers = Arrays.copyOfRange(numbers, 1, numbers.length);
//			numbers[0] = "-" + numbers[0];
//		}
		
		//2번 방법 숫자배열 첫칸에 0넣기
		
		if(numbers[0].equals("")) {numbers[0]="0";}
		
		for (int i = 0; i < numbers.length-1; i++) {
			numbers[i+1] = getCalc(arbuho, i).calc(Integer.parseInt(numbers[i]),Integer.parseInt(numbers[i+1]))+"";
			
			result =Integer.parseInt(numbers[i+1]);
		} 
		System.out.println("계산결과는" + result + "입니다");
		
		
		
		
	}
	//3항 이용한 람다식으로 변경
	static Calc getCalc(String [] arbuho,int i) {
		
		 
		 
		 
		
		
		return arbuho[i].equals("+") ? (n1,n2) ->n1+n2 : (n1,n2) -> n1-n2;
	
	}
	
	
	
	
}
