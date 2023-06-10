package listTask;

public class Main {
	public static void main(String[] args) {
		UserService service = new UserService();
		UserVO user = new UserVO("abc111", "111", "홍길동",22);
		
		if(service.checkId(user.getId())) {
			service.join(user);
			System.out.println("가입이 완료되었습니다.");
		}else {
			System.out.println("아이디가 존재 합니다.");
		}
		user = service.login("abc111", "111");
		
		if(user !=null) {
			System.out.println(user.getName() + "님 환영합니다");
			
		}else {
			System.out.println("로그인에 실패하셧습니다");
		}
	}
}
