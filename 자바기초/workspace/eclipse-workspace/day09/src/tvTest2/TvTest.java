package tvTest2;

class Tv {
	int ch;
	int vol;
	boolean power;
	String color;
public Tv() {
	
}
	public Tv(int ch, int vol, boolean power, String color) {
		this.ch = ch;
		this.vol = vol;																																//ctrl d 한줄삭제
		this.power = power;
		this.color = color;
	}																																					//	alt + shift s + o = 필드 생성자 자동 생성		


}

public class TvTest {
	public static void main(String[] args) {
		Tv tv = new Tv(3,5,false,"black");
		//Tv tv = new Tv(); 라고하면 기본생성자가 존재하지 않아서 오류난다. 생성자를 만들었기 때문에 
		
		System.out.println(tv.ch);
		System.out.println(tv.vol);
		System.out.println(tv.color);
		System.out.println(tv.power);
		//생성자를 활용하면 객체를 만듬과 동시에 내가 원하는 값으로 초기화 할 수 있다.
		

	}
}
