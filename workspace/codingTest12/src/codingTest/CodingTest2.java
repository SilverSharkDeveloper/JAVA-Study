package codingTest;

public class CodingTest2 {
	static int solution(String now, String pw) {
		int answer = 0;
		
		for (int i = 0; i < now.length(); i++) {
			if(Math.abs(now.charAt(i)  - pw.charAt(i))<=5) {
				answer += Math.abs(now.charAt(i)  - pw.charAt(i));
			}else {
				answer += 10 - Math.abs(now.charAt(i)  - pw.charAt(i));
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("54309", "91951"));
	}
}
