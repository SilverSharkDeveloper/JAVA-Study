package json;

public class Product {
	private static Long sequence;
	private long id;
	private String name;
	private int stock;
	private int price;
	
	static {
		sequence = 0L;
	}
	
	{
		sequence++;
	}

	public Product( String name, int stock, int price) {
		super();
		this.id = sequence;
		this.name = name;
		this.stock = stock;
		this.price = price;
	}

	

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", stock=" + stock + ", price=" + price + "]";
	}
	
}
