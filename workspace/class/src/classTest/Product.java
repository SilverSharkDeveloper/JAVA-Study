package classTest;

//상점에서 상품 판매 시 손님의 할인율을 적용하여 판매

public class Product {
	String product;
	int price;
	int lest;
	
	public Product(String product, int price, int lest) {
		this.product = product;
		this.price = price;
		this.lest = lest;
	}
	
	void sale(User u) {
		u.count = u.count -price  + price*(u.dis)*0.01;
		lest --;
	}
	
	
}

