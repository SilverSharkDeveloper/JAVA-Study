package lambdaTest;

public class Main {
	public static void main(String[] args) {
	int result =	Main.calculator(true).multiplyNumber(5, 6);
	System.out.println(result);
	MultipleInter mi = (n1,n2) -> n1*n2;
	mi.multiplyNumber(5, 6);
	
	}
	
	public static MultipleInter calculator (boolean isTrue) {
		if(isTrue) {
//			 MultipleInter m = (n1,n2) -> n1*n2;
		     	return (n1,n2) -> n1*n2;
			
		}else {
			return (n1,n2) -> 0;
		}
	}
}
