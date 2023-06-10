package bank;

public class Kakao extends Bank{

	@Override
	void deposit(int money) {
		this.money += money/2;
	}
	
}
