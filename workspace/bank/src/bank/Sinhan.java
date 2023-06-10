package bank;

public class Sinhan extends Bank{

	@Override
	int seeAccount() {
		if(this.money!=0) {
		(this.money)/=2;
		}
		return this.money;
	}
	
}
