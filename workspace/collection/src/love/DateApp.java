package love;

import java.util.ArrayList;
import java.util.Collections;

public class DateApp {

		static ArrayList<Love> searchLove(int age){
			ArrayList <Love> love = new ArrayList<>();
			for(Love lover : DBConnecter.db) {
				if(lover.getAge()==age) {
					love.add(lover);
				}
			}
			return love;
		}
		
		static void setAge(Love love, int age) {
			love.setAge(age);
			
		}
		
		static ArrayList<Love> ageList(){
			//생성자에 컬렉션 객체 넣으면 복사해 담음.
			ArrayList<Love> love = new ArrayList<>(DBConnecter.db);
	//앞에 주소에 뒤에 리스트 복사해 넣음		
			//Collections.copy(love, DBConnecter.db);
//	Love 클래스에 coparable을 구현해 copareto를 오버라이딩 ->		
			Collections.sort(love);
			
			return love;
		}

	
		
}
