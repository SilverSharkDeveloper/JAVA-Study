package toy;

public class Main {
public static void main(String[] args) {
	Company seoul = new Company("서울");
	
	seoul.register(new Dog());
	
	seoul.register(new Toy() {
		
		@Override
		public String[] speakList() {
String[] list = {"앵ㅇ",	"ㅇ" ," 이롱", "ㅇㄹㄴ"};

			return list;
		}
		
		@Override
		public void pushBtn(String speak) {
			System.out.println(speak);
		}
	});
	
	Company busan = new Company("부산");
	
busan.register(new Toy() {
	
	@Override
	public String[] speakList() {
			String[] list = {"a","b","c"};
		return list;
	}
	
	@Override
	public void pushBtn(String speak) {
		System.out.println(speak);
	}
});
}
}
