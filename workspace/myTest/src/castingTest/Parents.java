package castingTest;

	class Child extends Parents{
			int b;
	}

public class Parents {
		int a;
		void set() {}
		
		
		
		public static void main(String[] args) {
				Parents p = new Parents();
				Child c = new Child();
				Parents p1= null;
				p1=p;
				
				System.out.println(p1.a);
				int a = 0;
				double d = 0;
				a = (int)0.9;
				d =0;
				d =1.9;
				
		}
}
