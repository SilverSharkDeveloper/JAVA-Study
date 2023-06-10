package listTask;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	List <UserVO> userList = new ArrayList<>();
	
	public boolean checkId(String id) {
		for(UserVO user : userList) {
			if(user.getId().equals(id)) {
				return false;
			}
		}
		return true;
	}
	
	public void join(UserVO user) {
		userList.add(user);
}
	public UserVO login(String id, String pw) {
		for(UserVO user : userList) {
			if(user.getId().equals(id)&&user.getPw().equals(pw)) {
				return user;
			}
		}
		return null;
	}
}