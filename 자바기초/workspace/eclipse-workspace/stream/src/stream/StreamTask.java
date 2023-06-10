package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask {
	public static void main(String[] args) {
		int[] ar = { 2, 2, 7, 7, 5, 5, 1, 1, 6, 6, };

		
		//ar배열을 List<Integer>로 변환해서, list 변수에 저장하기
		//위에서 만든 List의 중복값을 없애고, int[]로 변환해서 , ar2변수에 저장
		//ar 배열의 중복값을 처리하고, 각요소에 10을 더하고, 정렬하여 출력하기
		//ar배열의 요소 중 홀수만 골라서,3을 더하고, 역정렬하고,아무 특수문자와 더해서 출력하기
		
		List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
		int[] ar2 = list.stream().mapToInt(i -> i).toArray();
		list.stream().distinct().map(i -> i+10).sorted().forEach(System.out::println);
		Arrays.stream(ar).filter(i-> i%2 ==1).map(i -> i+3).boxed().sorted(Collections.reverseOrder()).map(i-> i+3).forEach(System.out::println);
		
		
		
		
	}
}
