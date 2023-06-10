package casting;


class Tv{
	int vol;
	int ch;
	void powerOnOff() {
		
	}
}

class SmartTv extends Tv{
	void netflix() {}
}


public class CastingTest {
	public static void main(String[] args) {
		//Up Casting
		//1.
//		SmartTv sTv = new SmartTv();
//		Tv tv = (Tv)sTv;
		//2.
//		Tv tv = (Tv)new SmartTv();
//		3.
		Tv tv = new SmartTv();
//부모 클래스 타입의 참조변수로 자식 클래스 타입의 객체를 참조한다.
		
		//Down Casting
		SmartTv sTv = (SmartTv)tv;
		
		//잘못된 down Casting
//		Tv parents = new Tv();
//		SmartTv child = (SmartTv)parents;
		//Down Casting은 반드시 Up Casting이 된 객체로 해야한다.
		//즉 Up Casting된 객체를 다시 원래 자식타입으로 돌리는것이 Down Casting이다.
	}
}
