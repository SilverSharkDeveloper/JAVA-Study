package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> animalSet = new HashSet<>();
		animalSet.add("코알라");
		animalSet.add("원숭이");
		animalSet.add("양");
		animalSet.add("쥐");
		animalSet.add("기린");
		animalSet.add("하마");
		animalSet.add("하마");
		animalSet.add("하마");
		animalSet.add("하마");
		
		System.out.println(animalSet);
//		System.out.println(animalSet.add("하마"));
//		System.out.println(animalSet.add("토끼"));
		
		Iterator<String> animalIter	=	animalSet.iterator();
		
		while(animalIter.hasNext()) {
			System.out.println(animalIter.next());
		}
		
	}
}
