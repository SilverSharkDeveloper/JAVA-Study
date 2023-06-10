package anonymousTask2;

public class Nike{
	public void register(Form form) {
		String[] product = form.getMenu();
		
		for (int i = 0; i < product.length; i++) {
			System.out.println(product[i]);
		}
		
		if(form instanceof FormAdapter) {
			System.out.println("무료나눔 입니다");
			return;
		}
		form.sell(product[0]);
		
	}
	
}
