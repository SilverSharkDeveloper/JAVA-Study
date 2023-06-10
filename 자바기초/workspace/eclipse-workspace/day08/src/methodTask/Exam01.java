package methodTask;

public class Exam01 {
	public static void main(String[] args) {
		Student 철수 = new Student();
		Student 웅이 = new Student();
		
		웅이.eng = 100;
		웅이.grade = "A";
		
		
		철수.eng = 20; 
		철수.math = 40 ;
		철수.kor = 60;
		철수.grade = "B";
		철수.avg = 22.2;
		
		System.out.println(철수.eng);
		System.out.println(웅이.eng);
	}
}
