package methodTask;

public class MethodTask {
	public static void main(String[] args) {
		MethodTask t = new MethodTask();
		int[] ar = { 1, 3, 4, 5, 2 };
		System.out.println(t.getAvg(ar));

		t.printMaxMin(ar);
		
		String test = "abce";																										//문자열을 문자 하나로 나누는 메소드 char At(index);
		System.out.println(test.charAt(0));
		
		
		System.out.println(t.changeCase("BaNanA"));
	}

	double getAvg(int[] ar) {
		int total = 0;
		for (int i = 0; i < ar.length; ++i) {
			total += ar[i];
		}
		return (double) total / ar.length;
	}

	void printMaxMin(int[] ar) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < ar.length; i++) {
			min = min > ar[i] ? ar[i] : min;
			max = max < ar[i] ? ar[i] : max;
		}
		System.out.println("최대값 >>" + max);
		System.out.println("최솟값 >> " + min);
	}
	
	String changeCase (String str) {
		String result = "";
		char c = ' ';
		for(int i = 0 ; i<str.length(); i++) {
		c =str.charAt(i);
		
		if (c>='a'&& c<='z') {
			 result+= (char)(c - 32);
		}else if (c>='A'&&c<='Z') {
			result += (char)(c+32);
		}
		else {
			result = "잘못된 값 입니다.";
		}

	
		}
		return result;
	}
}
