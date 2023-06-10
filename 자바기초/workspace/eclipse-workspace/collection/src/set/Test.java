package set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(10);
	list.add(10);
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(20);
	list.add(30);
	System.out.println(list);
	
	Set<Integer> set = new HashSet<>(list);
	List<Integer> result = new ArrayList<>(set);
	
	System.out.println(result);
}
}
