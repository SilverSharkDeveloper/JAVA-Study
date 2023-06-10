package inter;

public class Main {
public static void main(String[] args) {
	Inter inter = new ClassA();
	ClassA a = new ClassA();
	
	inter.method1();
	inter.method12();
	System.out.println(Inter.var1);
	System.out.println(ClassA.var1);
}
}
