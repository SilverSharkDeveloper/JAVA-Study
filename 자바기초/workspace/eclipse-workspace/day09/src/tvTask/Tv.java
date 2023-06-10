package tvTask;

public class Tv {
	String color;
	int inch;
	int price;
	boolean power;
	int channel;
	public Tv(String color, int inch, int price, int channel) {
		this.color = color;
		this.inch = inch;
		this.price = price;
		this.channel = channel;
	}
	void powerOnOff() {
		this.power = !this.power;
	}
	int chUp() {
	return	++this.channel;
	}
	int chDwon() {
		return  --this.channel;
		
		
	}
	public Tv(String color, int inch, int price) {
		this.color = color;
		this.inch = inch;
		this.price = price;
		this.channel = 10;								//키자마자 채널 10 오버로딩
	}
}
