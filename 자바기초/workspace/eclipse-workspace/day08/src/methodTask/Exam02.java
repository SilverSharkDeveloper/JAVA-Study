package methodTask;

public class Exam02 {
	public static void main(String[] args) {
		Student 짱구 = new Student();
		Student 유리	 = new Student();
		
			짱구.eng = 20 ;
			짱구.math = 40 ;
			짱구.kor = 80 ;
			
			유리.eng = 20 ;
			유리.math = 50 ;
			유리.kor = 90 ;
	
		System.out.println(짱구.getTotal());
		System.out.println(유리.getTotal());
		
	 
		
	}
}
