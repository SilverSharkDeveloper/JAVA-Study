package arrayListTask.User;

import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Random;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
	
		private static final int RANDOMCOUNT = 6;
		
	
	//아이디 중복 검사
	static User checkId(ArrayList<User> db, String id) {
		for (User user : db) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
	//회원가임
	static User join(ArrayList<User> db, String name, String id, String pw, String PhoneNumber) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setPhoneNumber(PhoneNumber);
		user.setPw(pw);
		db.add(user);
		return user;
	}
	
	//로그인
	static User login(ArrayList<User> db, String id, String pw) {
		User user = checkId(db, id);
		
		if(user.getPw().equals(pw)) {
			return user;
		}
		return null;
		
	}
	
	//비밀번호 변경 -> 마이페이지에서 수정완료 누르면 DB바꾸기
	static void changePw(User user , String pw) {
		user.setPw(pw);
	}
	
	//암호화
	static String encript(User user) {
		return new String (Base64.getEncoder().encode(user.getPw().getBytes()));
		
	}
	//복호화
	static String decript(User user) {
		return new String (Base64.getDecoder().decode(user.getPw().getBytes()));
		
	}
	
	//인증번호 보내기
	static String sendMessege(String phoneNumber) {
		String api_key = "NCS8NC18VYMQRARY";
	       String api_secret = "C3C8PYYLBMIQXAFQHSPJ1M0LSUONVAUK";
	       Message coolsms = new Message(api_key, api_secret);
	       
	       String keywords = getNumber();
	     
	       // 4 params(to, from, type, text) are mandatory. must be filled
	       HashMap<String, String> params = new HashMap<String, String>();
	       params.put("to",phoneNumber );
	       params.put("from", "01080128867");
	       params.put("type", "SMS");
	       params.put("text", "인증번호 입니다\n" +keywords);
	       params.put("app_version", "test app 1.2"); // application name and version

	       try {
	         JSONObject obj = (JSONObject) coolsms.send(params);
	         System.out.println(obj.toString());
	       } catch (CoolsmsException e) {
	         System.out.println(e.getMessage());
	         System.out.println(e.getCode());
	       }
	 return keywords;
	}
	
	//인증번호 생성
	static String getNumber() {
		 String keywords = "";
	       Random r = new Random();
	       for (int i = 0; i < RANDOMCOUNT ; i++) {
			keywords+= r.nextInt(10) + "";
		}
	       return keywords;
	       
	       
	}
	
}
