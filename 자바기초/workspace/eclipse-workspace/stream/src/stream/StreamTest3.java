package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamTest3 {
	public static void main(String[] args) {
		/*
		 * stream의 모든 메소드는 중간 연산과 최종 연산으로 나뉜다.
		 * forEach()는 최종 연산이다.
		 */
		
		//map()	: 각 요소를 변환한다.(연산)
//		IntStream.range(0, 5).map(i -> i+10).forEach(i ->System.out.println(i));
		
		//sorted() : 정렬한다.
		int []ar = {6,2,3,4,5,1,3};
		Arrays.stream(ar).sorted().forEach(i -> System.out.println(i));
		
		//boxed()	:박싱
		//sorted(Collection.reverseOrder()):역정렬, 단 일반자료형 요소는 박싱이 필요하다 
		Arrays.stream(ar)
		.boxed()
		.sorted(Collections.reverseOrder())
		.forEach(i -> System.out.println(i));
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		
		//중복제거 메소드 distinct();
		list.stream().distinct().forEach(i ->System.out.println(i));
		
		//언박싱 : mapToInt(): 요소를 기본자료형 int로 변환한다.(언박싱)
		list.stream().mapToInt(i -> i).forEach(i -> System.out.println(i));
		
//		filter() : 요소를 조건에 맞게 걸러낸다. if문 비슷하게 사용가능
		list.stream().filter(i -> i%2==0).forEach(i ->System.out.println(i));
		
		
		//중복제거 , 짝수만 걸러내고 ,10을 더하고, 각각출력하기
		list.stream().distinct().filter(i -> i%2==0).map(i -> i+10).forEach(i -> System.out.println(i));
		
	}
}
