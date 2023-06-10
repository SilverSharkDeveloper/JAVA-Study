package arrayTest;

import java.util.Arrays;

public class ArTest1 {
	public static void main(String[] args) {
		int[] arData = {2,4,5,6,7};
//		System.out.println(arData);
//		System.out.println(arData.length);
//		
		for(int i =0; i<arData.length;i++) {
			arData[i] = 5-i;
			System.out.println(arData[i]);
		}
		String a = "ABC";
		System.out.println(Arrays.toString(arData));
		
		char [] arChar = a.toCharArray();
		System.out.println(arChar);
		

		Arrays.sort(arData);
	}
	
}
