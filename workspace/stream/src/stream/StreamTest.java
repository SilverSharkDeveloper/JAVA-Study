package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
	
	static	boolean checkIstrue(int num) {
			return num%2==0;
		}
	
	public static void main(String[] args) {
		//배열을 리스트로
		//여러개의 값을 List로 변경 가능
		Integer [] arData = {10,20,30,40};
		ArrayList<String> datas = new ArrayList<>(Arrays.asList("23","23"));
		ArrayList<Integer> datas2 = new ArrayList<>(Arrays.asList(arData));
		
		//가변인자 -> 전달받은 여러개의 값을 배열을만들어 전달
		
		System.out.println(datas.toArray());
		System.out.println(datas);
		
		ArrayList<Integer> datas3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		//forEach()
		//여러 값을 가지고 있는 컬렉션 객체에서 forEach 메소드를 사용할 수 있다.
		//Consumer는 함수형 인터페이스이기 때문에 람다식을 사용할 수 있다.
		//매개변수에는 컬렉션 객체 안에 있는 값들이 순서대로 담기고, 화살표 뒤에서는 실행하고 싶은 문장을 작성한다.
		datas3.stream().forEach(data -> System.out.println(data));
		
		datas3.forEach(data -> System.out.println(data));
		datas3.forEach(System.out::println);
		
		datas3.stream().map(data -> data*2).forEach(System.out::println);
	
	
		
		//참조형 -> 소속명 :: 메소드명 (변수, -> 생략가능)
		//map클래스명 :: 필드값
	
		
		//forEach()하나씩 꺼내 처리
//		map() : 기존값변경
		//range(inclusive,exclusive)
		IntStream.range(1, 11).forEach(System.out::println);
		
		ArrayList<Integer> datass = new ArrayList<Integer>();
		
		datass.stream().sorted(Collections.reverseOrder());
		IntStream.range(1, 11).forEach(datass::add);
		
		//chars() : 문자열을 IntStream으로 변경
		
		String dta = "ABC";
		dta.chars().forEach(i -> System.out.println((char)i));
		 
		
		//filter():if문 조건식을 써야하며 조건식에 true값만 다음으로 넘어간다.
		IntStream.range(0, 10).filter(StreamTest :: checkIstrue).forEach(System.out::println);
		
		//sorted() 정렬
		//sorted(Collections.reverseOrder)
		//collect() : 결과를 다양한 타입으로 리턴해준다.
		
		//컬렉션에sort()는 직접 접근해 정렬, sorted()는 원본데이터 변경하지않음
		//stream은 원본데이터 변경하지 않음
		
		//Collectors.joining(구분점) 각각의 문자열을 구분점을 합쳐서 하나의 스트링으로 리턴해준다.
		
		String a = datass.stream().map(String::valueOf).collect(Collectors.joining());
				System.out.println(a);
		
		
	}
}
