package anonymousTask;

public class Starbucks {
	public void register(Form form) {
		String[]menu = form.getMenu();
		
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		if(form instanceof FormAdapter) {
			System.out.println("무료나눈 ㅁ매장입니다");
			return;
		}
		form.sell("아메리카노");
	}
}
