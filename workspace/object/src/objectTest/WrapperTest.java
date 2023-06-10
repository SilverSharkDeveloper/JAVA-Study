package objectTest;

import java.util.ArrayList;
import java.util.List;

public class WrapperTest {
	public static void main(String[] args) {
		int a = 0;
		
		//boxing
		Integer i = Integer.valueOf(10);
		//autoboxing
		i = 10;
		
		//unboxing
		a = i.intValue();
		//auto unboxing
		a = i;
		
	
		
	}
}
