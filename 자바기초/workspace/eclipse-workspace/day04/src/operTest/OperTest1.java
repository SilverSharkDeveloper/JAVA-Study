package operTest;

public class OperTest1 {
public static void main(String[] args) {
	int num1 = 10, num2= 20;
	
	boolean isTrue = 10==10;
	
	System.out.println(10==10);
	System.out.println(10==11);
	System.out.println(num1 != num2);
	
	System.out.println("==========================================================");
	System.out.println(true&&true);
	System.out.println(true&&false);
	System.out.println(true||false);
	System.out.println(false||false);
	
	System.out.println(num1 == 10 && num2 == num1);
	System.out.println(num1!=10 || num2>10);
	
	System.out.println("==================================================");
	
	System.out.println(!true);
	System.out.println(! (num1==num2));
	
	
}
}
