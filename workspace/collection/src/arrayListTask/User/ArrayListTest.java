package arrayListTask.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<Integer> datas = new ArrayList<>(10);
	
			datas.add(10);
			datas.add(20);
			datas.add(30);
			datas.add(40);
			datas.add(50);
			datas.add(70);
			datas.add(80);
			datas.add(90);
			datas.add(100);
			
			System.out.println(datas);
			Collections.sort(datas);
			System.out.println(datas);
			
			//중앙을 기준으로 좌우 변경 -> 반드시 sort후 사용해야 역정렬
			Collections.reverse(datas);
			
			System.out.println(datas);
			
			Collections.shuffle(datas);
			System.out.println(datas);
			
			//추가 (삽입) 60은 항상 30뒤에 삽입
			//수정 10을 1로 수정
			//삭제(값으로 삭제) 20을 삭제
			//삭제(인덱스로 삭제) 50을 삭제
			
			if(datas.contains(30)&&!datas.contains(60)) {
				datas.add(datas.indexOf(30)+1, 60);
			}
			
			System.out.println(datas);
			
			if(datas.contains(10)) {
				
				datas.set(datas.indexOf(10), 1);
			}
			
			System.out.println(datas);
			
			//remove 메소드 오버로딩으로 Integer 받는거한 int받는거하나 반드시 박싱필요
			
			if(datas.contains(20)) {
				datas.remove(Integer.valueOf(20));
			}
			
			System.out.println(datas);
			
			if(datas.contains(50)) {
				datas.remove(datas.indexOf(50));
			}
			
			System.out.println(datas);
			datas.clear();
			
			
			//추가 삭제는 반드시 새배열 만들고 카피
			
	}
}
