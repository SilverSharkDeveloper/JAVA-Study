package test;

public class Test implements Inter1, Inter2, Inter3{
	@Override
	public void printText() {
		Inter2.super.printText();
//		System.out.println("Test");
	}
}
