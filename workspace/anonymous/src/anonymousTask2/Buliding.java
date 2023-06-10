package anonymousTask2;

public class Buliding {
	public static void main(String[] args) {
		Nike gangnam = new Nike();
		Nike jamsil = new Nike();
		gangnam.register(new Form() {
			
			@Override
			public void sell(String order) {
				String []	menu = getMenu();
				for (int i = 0; i < menu.length; i++) {
					if(menu[i].equals(order)) {
						System.out.println(order + "판매합니다");
						return;
					}
						
				}
				System.out.println("판매할 상품이 없습니다");
				
			}
			
			@Override
			public String[] getMenu() {
				return new String[] {"신발","모자","옷"};
			}
		});
		
		jamsil.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				return new String[]	{"신발","모자","옷","허리띠"};
			}
		});
		
		
	}
}
