package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(30);
		list.add(80);
		list.add(20);
		list.add(90);
		list.add(40);
		list.add(70);
		
		//Collections클래스 : 컬렉션 프레임워크와 관련된 여러 메소드를 가지고 있다.
		//일부 알고리즘도 구현해 놓았다.
		//static메소드로 구현했기 때문에 객체를 만들 필요가 없다.
		
		Collections.sort(list);		//오름차순 정렬
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());	//역정렬, 내림차순 정렬
		System.out.println(list);
		
		Collections.shuffle(list); //섞기
		System.out.println(list);
		
		Collections.reverse(list); //현재 값들을 반대로 뒤집기(정렬 아님)
		System.out.println(list);
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
	}
}
