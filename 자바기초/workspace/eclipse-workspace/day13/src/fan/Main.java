package fan;

public class Main {

	public static void main(String[] args) {
		method(new BasicFan());
		method(new BasicFan2());
		method(new SmartFan());
	}
static void method(Fan fan)	{
	fan.on();
	fan.off();
	fan.turbo();
}
}
