package arrayTest;

import java.util.Arrays;
class A{
	int a;
}
public class Test {
public static void main(String[] args) {
	int[] ar = {1,2,3,4,5};
	System.out.println(Arrays.toString(ar));
	double a = Math.sqrt(24);
	System.out.println(a);
	System.out.println("안녕하세요.".substring(4));
	System.out.println(new A().a);
}
}
