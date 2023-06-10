package lambdaTest;

public class Main2 {
	public static void main(String[] args) {
		String str = checkString("F").MySubString("sagd", "dc");
		System.out.println(str);
	}
	static SubInter checkString(String str) {
		SubInter sub = null;
		
		switch(str) {
		case"F":
			sub = (s1,s2) -> s1.substring(s2.length());
			break;
			
		case "B":
			sub = (s1,s2) -> s1.substring(0,s1.length()-s2.length());
			break;
		}
		return sub;
	}
}
