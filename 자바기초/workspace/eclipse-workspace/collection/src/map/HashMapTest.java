package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		
		Map<String, Integer>	map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		
		System.out.println(map);
		System.out.println(map.put("A", 33));
		System.out.println(map);
		
		System.out.println(map.get("A"));
		System.out.println(map.size());
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
	}
}
