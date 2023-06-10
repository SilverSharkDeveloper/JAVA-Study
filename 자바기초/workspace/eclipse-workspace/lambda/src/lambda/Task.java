package lambda;

public class Task {
	public static void main(String[] args) {
		FunctionalInter3 fi3 = (n1, n2) -> n1*n2;
		int a = fi3.method(5, 3);
		System.out.println(a);
		
		FunctionalInter4 fi4 = (s1, s2) -> System.out.println(s1 + s2);
		fi4.combineString("안녕", "하세요");
		
		
	}
}
