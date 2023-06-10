package classTest;

import java.util.Scanner;

class SuperCar {
	String brand;
	String color;
	int price;
	boolean engine;
	String result;
	String pw;
	int cnt;

	public SuperCar(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	{// 초기화 블럭 어떤 생성자든 반드시 실행되는 초기화 코드
		this.pw = "0000";
	}

	public SuperCar() {
		
	}

	void engineStart() {
		engine = true;

	}

	void engineStop() {
		engine = false;
	}

	boolean checkPw(String pw) {
		return (this.pw).equals(pw);
	}
}

public class ClassTask1 {
	public static void main(String[] args) {
		SuperCar mom = new SuperCar("페라리", "파랑색", 68_999);
		String result = "";
		int choice = 0;
		int flag = 0;

		String msg = "1.시동 켜기 \n2.시동 끄기";
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			
			System.out.println(msg);

			choice = sc.nextInt();

			switch (choice) {
			case 1:

				if (!mom.engine) {
					System.out.println("비밀번호를 입력해주세요");
					if (mom.checkPw(sc.next())) {
						result = "시동을 켰습니다";
						mom.engineStart();
						mom.cnt = 0;
					} else {
						result = "비밀번호가 틀렸습니다";
						mom.cnt++;
						flag ++;
					}
				} else {
					result = "이미 시동이 켜져있습니다";
				}

				break;

			case 2:
				if (mom.engine) {
					result = "시동을 껐습니다";
					mom.engineStop();
				} else {
					result = "시동을 먼저 켜주세요";
				}
				break;

			default:
				result = "잘못 입력하셨습니다.";
				break;
			}
			if (mom.cnt == 3) {
				result = "경찰 출동";
			
			}
			System.out.println(result);
			if(flag == 3) {break;}
	
		}
	}
}
