package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
	
	static boolean checkCh(String str) {
		return str.charAt(0)>=65&&str.charAt(0)<97;
	}
	
	static boolean checkNum(int num) {
		return num % 2 == 0;
	}
	static boolean checkNum2(int num) {
		return num % 2 == 1;
	}
	static boolean checkChIsD(int ch) {
		return ch != 'D';
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		
		IntStream.range(0, 10).map(i -> 10-i).forEach(ar :: add);
		System.out.println(ar);
		ar.clear();
		
		IntStream.range(1, 11).forEach(ar :: add);
		System.out.println(ar);
		ar.clear();
		
		String a ="ABCDEF";
		a.chars().forEach(i -> System.out.println((char)i));
		
		IntStream.range('A','G').forEach(arpha -> System.out.println((char)arpha));
		
		IntStream.range(1, 101).filter(StreamTask::checkNum2).forEach(ar::add);
		System.out.println(ar);
		ar.clear();

		
		List<Character> arChar = new ArrayList<Character>();
		
	
		
	IntStream.range('A', 'G').filter(StreamTask::checkChIsD).forEach(ch -> arChar.add((char)ch));
		System.out.println(arChar);
		arChar.clear();
//		
		List<String> arString = new ArrayList<String>(Arrays.asList("Black","WHITE","reD","yeLLow","PINK"));
		arString = arString.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(arString);
		arString.clear();
		
		
		
		
		IntStream.rangeClosed(1,100).filter(StreamTask::checkNum).forEach(ar :: add);
		System.out.println(ar);
		ar.clear();
	
		
		arString = new ArrayList<String>(Arrays.asList("Apple","banana","Melon"));
		arString.stream().filter(StreamTask::checkCh).forEach(System.out::println);
		
		
		
		String hangle = "공일이삼사오육칠팔구";
		String input = "공일이삼";
		String inputt = "0123";
		
		inputt.chars().map(i -> i-48).forEach(i -> System.out.println(hangle.charAt(i)));
		input.chars().map(hangle::indexOf).forEach(System.out::println);
		
		
		
		
		
		
		
		
	}
}
