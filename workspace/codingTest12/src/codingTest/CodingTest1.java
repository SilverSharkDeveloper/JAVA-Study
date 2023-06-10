package codingTest;

public class CodingTest1 {
		static int solution(String input){
			String [] arSplitBy0 = input.split("0");
			int answer = 0;
			
			for (int i = 0; i < arSplitBy0.length; i++) {
				if(arSplitBy0[i]!="") {
					answer = answer>arSplitBy0[i].length() ? answer : arSplitBy0[i].length();
				}
			}
		
			return answer;
		}
		
		
		public static void main(String[] args) {
			System.out.println(solution("00111111000110110101110001100111111110001111111111111111110111111111"));
		}
		
}	
