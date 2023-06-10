package test;


class Student{
	int math;
	int eng;
	int kor;
}







public class RefTest {
public static void main(String[] args) {
//	int[] ar = {1,2,3};
//	int[] ar2 = ar;
//	ar[1] = 100;
//	System.out.println(ar[1]);
	
	Student s1 = new Student();
	Student s2 = s1;
	
	s1.math = 100;
	s1.eng = 30;
	s1.kor = 40;	
	
	System.out.println(s2.math);
}


}

