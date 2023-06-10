package lambdaTask;

public class PrintNameTest {
	public static void main(String[] args) {
		PrintName p1 = (first,last) -> System.out.println(first+last);
		
		printFullName(p1);
	}
	
	static void printFullName(PrintName p) {
		p.getFullName("허","은상");
	}
	
	
}
