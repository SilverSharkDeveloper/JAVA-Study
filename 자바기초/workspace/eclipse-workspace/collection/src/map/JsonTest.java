package map;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		Map<String,String> user = new HashMap<>();
		
		user.put("id", "abc11");
		user.put("pw", "1234");
		user.put("name", "홍길동");
		System.out.println(user);
		
		JSONObject json = new JSONObject(user);
		System.out.println(json.toJSONString());
		
		System.out.println(json.get("id"));
		
		json.put("nickname", "hong");
		System.out.println(json.toJSONString());
		
		JSONArray jsonAr = new JSONArray();
		jsonAr.add(user);
		jsonAr.add(new JSONObject(user));
		System.out.println(jsonAr);
		
		System.out.println(((JSONObject)jsonAr.get(1)).get("id"));
	}
}
