package operTest;

public class OperTest2 {
public static void main(String[] args) {
	System.out.println(true ? 10 : 20);
	System.out.println(false	? 10 : 20);
	int num1 = 10 , num2 = 20, num3 = 20;
	int num4 = num1 > num2 ? 1 : -1;
	
	System.out.println(num1==num2 ? 10 :-1);
	System.out.println(num1> num3 ? num1 : "참");
	System.out.println(num4);
}
}
