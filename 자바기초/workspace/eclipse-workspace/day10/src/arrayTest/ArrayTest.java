package arrayTest;
class Student {
	int math;
	int kor;
	int eng;
	
}
public class ArrayTest {
public static void main(String[] args) {
	Student a = new Student ();
	Student [] ab = new Student[4];
	
	ab[0] = a;
	ab[1] = new Student();
	
	Student [] abc = {new Student(), new Student(), new Student()};
	abc[0].math = 10;

}
}
