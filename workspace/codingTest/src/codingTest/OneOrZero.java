package codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class OneOrZero {
	public int solution(String s) {
		int result = 0;

		String [] arSplitBy0 = s.split("0");
		
		
		for (int i = 0; i < arSplitBy0.length; i++) {
			if(arSplitBy0[i]!="") {
				result = result>arSplitBy0[i].length() ? result : arSplitBy0[i].length();
			}
		}
	
		
	
		
		return result;
	}
	public static void main(String[] args) {
//		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("00000".split("0")));
//		System.out.println(datas.stream().map(String::length).mapToInt(i -> i).max());
//		System.out.println(Arrays.toString("00000".split("0")));
		
		OneOrZero a = new OneOrZero();
		System.out.println(a.solution("00000"));
		
	}
}