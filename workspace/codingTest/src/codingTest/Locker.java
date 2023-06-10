package codingTest;

public class Locker {
	public int solution(String p, String s) {
		int answer = 0;

	
		
		for (int i = 0; i < p.length(); i++) {
			if(Math.abs(p.charAt(i)  - s.charAt(i))<=5) {
				answer += Math.abs(p.charAt(i)  - s.charAt(i));
			}else {
				answer += 10 - Math.abs(p.charAt(i)  - s.charAt(i));
			}
		}
		
	
		return answer;
	}
}