package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(30);
		list.add(80);
		list.add(20);
		list.add(90);
		list.add(40);
		list.add(70);
		System.out.println(list);
		
		//값 가져오기 : index번호로 특정 값 가져오기
		System.out.println(list.get(1));
		
		//값 삭제 : index번호로 삭제
//		list.remove(1);
		System.out.println(list.remove(1) + "(을)를 삭제했습니다.");
		System.out.println(list);
		
		//값을 검색하여 삭제(Object 타입으로 넘겨줘야함)
		list.remove(Integer.valueOf(80));
		System.out.println(list);
		
		//전체 삭제
//		list.clear();
//		System.out.println(list);
		
		//포함 여부 검사 : 리스트에 존재하면 true, 없으면 false
		System.out.println(list.contains(70));                          //auto박싱 매개변수로 int를 받는 오버로딩  메소드가 없으므로
		
		//값으로 인덱스 가져오기
		System.out.println(list.indexOf(90));
		
		//수정 : 수정할 인덱스와 값을 넘겨주어 수정한다.
		//수정되기 전의 값을 반환한다.
		System.out.println(list.set(2, 100));
		System.out.println(list);
		
		//메소드 설명에 throws가 있다면 예외처리를 고려한다.
		
	}
}
