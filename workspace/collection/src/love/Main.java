package love;

public class Main {
	public static void main(String[] args) {
		Love l1 = new Love("123813121", "l1", 23);
		Love l2 = new Love("123813122", "l2", 23);
		Love l3 = new Love("123813123", "l3", 24);
		Love l4 = new Love("123813124", "l4", 28);
		Love l5 = new Love("123813125", "l5", 20);
		Love l6 = new Love("123813126", "l6", 16);
		Love l7 = new Love("123813127", "l7", 28);
		
		
		DBConnecter.db.add(l1);
		DBConnecter.db.add(l2);
		DBConnecter.db.add(l3);
		DBConnecter.db.add(l4);
		DBConnecter.db.add(l5);
		DBConnecter.db.add(l6);
		DBConnecter.db.add(l7);
		
		for(Love love : DateApp.searchLove(23)) {
			System.out.println(love);
		}
		
		
		for(Love love : DateApp.ageList()) {
			System.out.println(love);
		}
		
		
		
	}
}
