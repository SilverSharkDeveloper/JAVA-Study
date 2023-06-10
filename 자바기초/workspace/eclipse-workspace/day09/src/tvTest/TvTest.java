package tvTest;

class Tv {
	int ch;
	int vol;
	boolean power;
	int inch;
	int price;
	String color;

	public Tv() {
	System.out.println("기본 생성자 실행!");
	}
	void power() {
	}

	void chUp() {
	}

	void chDwon() {
	}

	void volUP() {
	}

	void vulDown() {
	}
}


public class TvTest {
	public static void main(String[] args) {
		Tv tv = new Tv();
		//객체를 생성하면 각 저장공간에는 각 자료형의 디폴트값이 들어있다.
		System.out.println(tv.ch);
		System.out.println(tv.color);
		System.out.println(tv.power);

		tv.ch = 1;
		tv.vol = 10;
		tv.power = false;
		tv.inch = 25;
		tv.price = 2000000;
		tv.color = "black";
		//객체를 만들자마자 초기화 시켜주기위해 객체가 만들어지자마자 실행되는 생성자를 이용 (생성자는 객체의  값을 초기화하기위한 목적으로 사용)
	}
}
