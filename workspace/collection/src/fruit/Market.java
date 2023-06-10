package fruit;



public class Market {
	
	
	//중복검사
	static boolean checkFruitName(String fruit) {
		for(Fruit tempfruit : DBConnecter.db) {
			if(tempfruit.getName().equals(fruit)) {
				return true;
			}
		}
		return false;
	}
	
	
	//추가
	static void addFruit(Fruit fruit) {
		DBConnecter.db.add(fruit);
	}
	//삭제
	static void delFruit(String fruit) {
		DBConnecter.db.remove(getFruit(fruit));
			
	}
	//이름으로 Fruit객체 가져오기
	static Fruit getFruit(String fruit) {
		for (int i = 0; i < DBConnecter.db.size(); i++) {
			if(DBConnecter.db.get(i).getName().equals(fruit)) {
				return DBConnecter.db.get(i);
			}
		}
		return null;
	}
	
	//평균가격보다 낮은지 검사
	static boolean checkLowAverage(String fruit) {
		
		
		if(getFruit(fruit).getPrice()<avaerage()) {
			return true;
		}else {
			return false;
		}
	}
	
	//과일 전체 조회
	static String checkAllFruit() {
		String allFruit = "";
		for(Fruit fruit : DBConnecter.db) {
			allFruit += fruit.toString();
		}
		return allFruit;
	}

	static int checkPrice(String fruit) {
		return getFruit(fruit).getPrice();
	}

	//과일 전체 평균 값 구하기
	static int avaerage () {
		int all = 0;
		int avaerage = 0;
		for(Fruit tempFruit : DBConnecter.db) {
			all += tempFruit.getPrice();
		}
		avaerage = all/DBConnecter.db.size();
		return avaerage;
	}
	
	
}
