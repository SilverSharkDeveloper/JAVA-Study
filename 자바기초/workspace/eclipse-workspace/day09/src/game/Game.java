package game;

import java.util.Scanner;

//10턴 동안 생명력이 5 이상이면 해피엔딩 
//5이하면 게임오버

class Creature{
	//이름
	String name;
	//hp
	int hp;
	//밥먹은 수
	int eatCnt;
	//턴
	int turn;
	//변
	boolean poo ;

	public Creature(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	
	
	
	//먹기 : 턴 1증가, hp 2 증가
	void eat() {
		this.turn++;
		this.hp +=2;
		this.eatCnt ++;
	}
	//자기 : 3초 동안 잠에 든다. hp 2 감소, 턴 2증가
	void sleep() {
	for(int i = 0 ; i<3 ; i++) {
		System.out.println("Zzzzz.....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println("잠에서 깼습니다.");
	this.turn += 2 ;
	this.hp -= 2;
	}
	//대변보기 : 밥을 3번 먹으면 실행, 안치우면 1턴당 hp -1
	
	void poop() {
		System.out.println("대변을 봤다.");
		this.poo = true;
		this.eatCnt = 0;
		
	}
	//청소하기 : 대변을 치운다. 턴 1증가
	void cleanUp() {
		System.out.println("청소한다");
		this.poo = false;
		this.turn++;
	}
	//상태확인
	void printStatus() {
		System.out.println(this.turn + "일차");
		System.out.println("이름 : " + this.name);
		System.out.println("HP : " + this.hp);
	}
}


public class Game {
		public static void main(String[] args) {
			String title = "🎈🎈🎈🎈🎈🎈🎈🎈🎈\n"
					+ "🎈🎈🎈환영합니다🎈🎈🎈\n"
					+ "🎈🎈🎈🎈🎈🎈🎈🎈🎈" ;
			
			
			String mainMsg = "1.캐릭터 선택\n2. 종료\n 입력>>";
			String charMsg = "1. 피카츄\n 2. 두더지 \n 3.긴팔원숭이 \n4. 돌아가기\n 입력>>";
			String gameMsg = "1.먹기\n 2.자기\n3. 청소하기\n 4.상태확인\n 입력>>";
			
			Scanner sc = new Scanner(System.in);
			
			int choice = 0;
			int gameChoice = 0;
			String result = null;
			
			System.out.println(title);
			
			while(true) {
				System.out.print(mainMsg);
				choice = sc.nextInt();
				if(choice == 2) {break;}
				System.out.println(charMsg);
				choice = sc.nextInt();
				if(choice==4) {continue;}
				
				Creature[] creatures = {
						new Creature("피카츄",3),
						new Creature("두더지", 2),
						new Creature("긴팔원숭이"	, 4)
						};
				while(true) {
					Creature myChar = creatures[choice - 1];
					//1.먹기 2. 자기 3. 청소하기 4. 상태확인
					System.out.println(gameMsg);
					gameChoice = sc.nextInt();
					
					switch(gameChoice) {
					case 1 :
						myChar.eat();
						break;
					case 2 :
						myChar.sleep();
						break;
					case 3 :
						myChar.cleanUp();
						break;
					case 4 :
						myChar.printStatus();
						continue;
					default : 
						System.out.println("잘못입력했습니다.");
					}
					
					if(myChar.eatCnt>=3) {
						myChar.poop();
					}
					if(myChar.poo) {
						System.out.println("변을 치워야 합니다");
						myChar.hp--;
					}
					if(myChar.turn>=10) {
						System.out.println("******************");
						myChar.printStatus();
						System.out.println("******************");
						result = myChar.hp>= 5 ? "해피엔딩" : "게임오버";
						System.out.println(result);
						break;
					}
				}
			}
		}
}
