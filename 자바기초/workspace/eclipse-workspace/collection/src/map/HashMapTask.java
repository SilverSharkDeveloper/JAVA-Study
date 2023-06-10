package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 카페 메뉴
 * 아메리카노 2500
 * 라떼 3500
 * 모카 4500
 * 바닐라라떼4500
 * HashSet에 저장하기
 * 
 * 출력과 입력)
 * 1.아메리카노
 * 2.라떼
 * 3.모카
 * 4.바닐라 라떼
 * 입력>>2
 * 
 * 출력)
 * 라떼는 3500원 입니다.
 */

public class HashMapTask {
	public static void main(String[] args) {
		Map<String,Integer> coffee = new HashMap<>();
		coffee.put("아메리카노", 1500);
		coffee.put("라떼", 2500);
		coffee.put("모카", 3500);
		coffee.put("바닐라", 4500);
		String result = null;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.아메리카노\r\n"
					+ " * 2.라떼\r\n"
					+ " * 3.모카\r\n"
					+ " * 4.바닐라 라떼\r\n"
					+ " * 입력>>");
			int	choice = sc.nextInt();
			
			switch(choice) {
			case 1 : 
						result = "아메리카노는" + coffee.get("아메리카노") + "원 입니다.";
					break;
			case 2 :
				result = "라떼는" + coffee.get("라떼") + "원 입니다.";
				break;
			case 3 :
				result = "모카는" + coffee.get("모카") + "원 입니다.";
				break;
			case 4 :
				result = "바닐라는" + coffee.get("바닐라") + "원 입니다.";
				break;
			}
				
			System.out.println(result);		
		}
		
	}
}
