package castingTest;

import java.util.Scanner;

//넷플릭스
//애니,영화,드라마 클래스 선언
//사용자가 선택한 영상이 
//애니매이션 이라면 " 자막 지원" 기능 사용
//영화라면 "4D" 기능 사용
//드라마라면 "굿즈" 기능 사용


public class CastingTask {
	
	public static void checkvideo(Netflix video) {
		if(video instanceof Animation) {
			((Animation) video).printText();
		}
		if(video instanceof Drama) {
			((Drama) video).printText();
		}
		if(video instanceof Film) {
			((Film) video).printText();
		}
		
	}
		public static void main(String[] args) {
			 String msg = "비디오를 골라주세요 \n 1.바키\n2.더글로리\n3.올빼미";
			 int choice = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println(msg);
			choice = sc.nextInt();
			
			Animation baki  = new Animation();
			Drama  d = new Drama();
			Film f = new Film();
		
			switch(choice) {
			case 1 : 
				checkvideo(baki);
				break;
			case 2 :
				checkvideo(d);
				break;
			case 3 :
				checkvideo(f);
				break;
			}
			

			
			
			
		}
	
}
