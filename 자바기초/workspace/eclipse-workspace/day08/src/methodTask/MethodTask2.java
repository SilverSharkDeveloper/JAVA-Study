package methodTask;

public class MethodTask2 {
public static void main(String[] args) {
	
	MethodTask2 mt2 = new MethodTask2();
	
	
	if(mt2.login("admin"		, 1234	)) {
		System.out.println("관리자님 환영합니다.");
	}
	else {
		System.out.println("잘못입력하셨습니다.");
	}
        }


 

    boolean login(String id, int pw) {
    	if(id.equals("admin")&&pw==1234) {
    		return true ;
    	} 
    	return false;
    }



}
