package bank;

public class Kookmin extends Bank{

	@Override
	void withdraw(int money) {
		this.money -=money*1.5;
	}

}
