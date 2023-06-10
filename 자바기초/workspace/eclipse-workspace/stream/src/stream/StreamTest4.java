package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest4 {
	public static void main(String[] args) {
		//Stream의 최종 연산
		int[] ar = {3,5,6,1,2,};
		List<Integer> list = new ArrayList<>();
		
		for(int num : ar) {
			list.add(num);
		}
		//count() : 요소의 숫자를 세어준다. [사용빈도 낮음]	
		long count = list.stream().count();
		System.out.println(count);
		
		//sum() : 요소의 합을 구해준다.(기본타입 스트림만 가능하므로 Integer는 언박싱해야한다.)
		int sum = list.stream().mapToInt(i -> i ).sum();
		System.out.println(sum);
		
		//collect(Collectors.toList()): 최종반환을 리스트로 해준다. 박싱을 항상 주의한다.
		List<Integer> list2 = Arrays.stream(ar).boxed().collect(Collectors.toList());
		Set<Integer> set = Arrays.stream(ar).boxed().collect(Collectors.toSet());
		Map<String,Integer> map = Arrays.stream(ar).boxed().collect(Collectors.toMap(i -> i + "번째",i -> i *10));
		
		System.out.println(map);
		
		//toArray() : 최종반환을 배열로 해준다. 언박싱을 항상 주의한다.
		int[] myArray = list.stream().mapToInt(i -> i ).toArray();
		System.out.println(Arrays.toString(myArray));
		
		
	}
}
