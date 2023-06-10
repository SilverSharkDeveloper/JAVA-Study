package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StremaTest {
	public static void main(String[] args) {
		int [] ar = {1,2,3};
		Arrays.stream(ar).map(i -> i*2).toArray();
		
		String str = "ser";
		List<String> a = new ArrayList<>(Arrays.asList(str.split("")));
		Collections.reverse(a);
		
		System.out.println(a.toArray().toString());
		System.out.println(a.toArray());
	
		
	
		
		
	}
}
