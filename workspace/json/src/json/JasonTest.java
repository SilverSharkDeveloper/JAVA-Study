package json;

import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JasonTest {
	public static void main(String[] args) {
		Product p1 = new Product("감자", 100, 5000);
		Product p2 = new Product("고구마", 600, 7000);
		
		JSONObject gamja = new JSONObject(p1);
		JSONObject goguma = new JSONObject(p2);
		JSONObject products = new JSONObject();
		try {
			products.put("감자", gamja);
			products.put("고구마", goguma);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			goguma.put("discount", "50%");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(products);
	
		try {
			System.out.println(products.getJSONObject("고구마").get("discount"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(goguma);
		
		
	}
}
