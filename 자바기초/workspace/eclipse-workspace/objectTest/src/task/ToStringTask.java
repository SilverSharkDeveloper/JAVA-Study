package task;
class Student{
	int math;
	int kor;
	int eng;
	String grade;
	double avg;

	public Student(int math, int kor, int eng, String grade, double avg) {
		super();
		this.math = math;
		this.kor = kor;
		this.eng = eng;
		this.grade = grade;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [math=" + math + ", kor=" + kor + ", eng=" + eng + ", grade=" + grade + ", avg=" + avg + "]"; 		
	}
	
}
public class ToStringTask {
public static void main(String[] args) {
	Student s1 = new Student(10, 50, 40, "A", 32.2);
	System.out.println(s1);

}
}
