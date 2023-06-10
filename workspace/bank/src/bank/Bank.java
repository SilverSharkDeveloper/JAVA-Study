package bank;

import java.util.Random;

//bank가 객체하나
//시작은 은행선택

public class Bank {
	
	String name;
	int account;
	String phoneNumber;
	
	//0001같은 비밀번호도 존재하므로 패스워드는 String타입
	String password;
	int money;
	
	
	

	
	
	
	
	@Override
	public String toString() {
		return "Bank [name=" + name + ", account=" + account + ", phoneNumber=" + phoneNumber + ", password=" + password
				+ ", money=" + money + "]";
	}


	//static
	//계좌번호 중복검사
	//1번질문 만약에 중복검사를 메소드로 만들지않고 화면에서 구현하면 힘든점 ->return을통해 다음반복은 안할수 있음 화면에선 불가능함
	//2번질문 계좌가없는 칸까지 모두 비교를 없애는 법
	
	//중복이 없다면 true , 있다면 false 
	//final -> 메소드도 저장공간 -> 오버라이드시 다른 주소값이 들어갈 수 있으므로 final로 선언해 오버라이딩 못하게 막음
	static final boolean checkAcount(Bank[][] arrBank, int tempAccount) {
		for (int i = 0; i < arrBank.length; i++) {
			for (int j = 0; j < arrBank[i].length; j++) {
				if(arrBank[i][j]==null) {break;}
				
				if(arrBank[i][j].account==tempAccount) {
					return false;
				}
			}
		}return true;
	}
	
	
	//핸드폰번호 중복검사
	static boolean checkPhoneNumber(Bank[][] arrBank, String tempPhoneNumber) {
		for (int i = 0; i < arrBank.length; i++) {
			for (int j = 0; j < arrBank[i].length; j++) {
					if(arrBank[i][j]==null) {break;}
				if(arrBank[i][j].phoneNumber.equals(tempPhoneNumber)) {
					return false;
				}
			}
		}return true;
	}
	
	//로그인 -> 그 계좌와 비밀번호가 일치한 그 객체의 방번호를 리턴
	static Bank login(Bank[][] arrBank, int account, String password) {
		for (int i = 0; i < arrBank.length; i++) {
			for (int j = 0; j < arrBank[i].length; j++) {
				if(arrBank[i][j]==null) {break;}
				if(arrBank[i][j].account == account && arrBank[i][j].password.equals(password)) {
					return arrBank[i][j];
				}
			}
		}return null;
	}
	
	//핸드폰번호로 객체의 위치 찾기
		static Bank PhoneCheck(Bank[][] arrBank, String phoneNumber) {
			for (int i = 0; i < arrBank.length; i++) {
				for (int j = 0; j < arrBank[i].length; j++) {
					if(arrBank[i][j]==null) {break;}
					if(arrBank[i][j].phoneNumber.equals(phoneNumber)) {
						return arrBank[i][j];
					}
				}
			}return null;
		}
	
	
	
//	//계좌번호로 객체위치 리턴
//	static Bank accountCheck(Bank[][] arrBank,	int account) {
//		for (int i = 0; i < arrBank.length; i++) {
//			for (int j = 0; j < arrBank[i].length; j++) {
//				if(arrBank[i][j]==null) {break;}
//				if(arrBank[i][j].account==account) {
//					return arrBank[i][j];
//				}
//			}
//		}return null;
//	}
//	
//	
//	
//	login 2
//	static Bank loginCheck(Bank[][] arrBank, String password) {
//		for (int i = 0; i < arrBank.length; i++) {
//			for (int j = 0; j < arrBank[i].length; j++) {
//				if(arrBank[i][j]==null) {break;}
//				if(arrBank[i][j].password.equals(password)) {
//					return arrBank[i][j];
//				}
//			}
//		}return null;
//	}
//	
		//각각 찾은 객체가 동일한 객체인지 동일한 객체이면 true 아니면 false ->템프를 두개활용
//	static boolean checklogin(Bank [][] arrBank, Bank account, Bank password) {
//	return	Bank.accountCheck(arrBank, account.account).equals(Bank.passWordCheck(arrBank, password.password)) ;
//		
//	}
	
	
	//계좌번호생성
	static	int getAccount() {
			Random r = new Random();
			String tempAccount = "" + (r.nextInt(9)+1);
			for (int i = 0; i < 5; i++) {
				tempAccount += r.nextInt(10);
			}
			return Integer.parseInt(tempAccount);
		}
		
		
	
	
	//입금
	void deposit(int money) {
		this.money += money;
	}
	
	//출금
	void withdraw(int money) {
		this.money -= money;
	}
	//잔액조회
	int seeAccount() {
		return this.money;
	}
}
