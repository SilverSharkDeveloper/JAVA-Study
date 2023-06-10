package methodTest;

import java.util.Arrays;

public class MethodTask {
	//1~10까지 println()으로 출력하는 메소드
	void printTen() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}
	
	//홍길동을 n번 println()으로 출력하는 메소드
	void printHong(int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.println("홍길동");
		}
	}
	
	//이름을 n번 println()으로 출력하는 메소드
	void printName(int cnt , String name) {
		for (int i = 0; i < cnt; i++) {
			System.out.println(name);
		}
	}
	
	//세 정수를 뺄셈해주는 메소드
	int subThree(int num1 , int num2, int num3) {
			return num1- num2- num3;
	}
	
	//두 정수의 나눗셈 후 몫과 나머지 두개를 구하는 메소드
	int[] devide(int num1 , int num2) {
		int[] ab = null;
		if(num2 != 0) {
			ab = new int[2];
		ab[0] =num1/num2;
		ab[1] = num1%num2;
		}
		return ab;
	}
	//1~n까지의 합을 구해주는 메소드
	int addNum(int max) {
		int total = 0;
		for (int i = 0; i < max; i++) {
			total += i+1;
		}
		return total;
	}
	//홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	int change(int num) {
		return num+1;
	}
	
	//문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	String changeString(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				newStr += (char)(str.charAt(i)+32);
			}else if(str.charAt(i)>=97 && str.charAt(i)<=122){
				newStr += (char)(str.charAt(i)-32);
			}else {
				newStr += str.charAt(i);
			}
		}return newStr;
	}
	//문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
	int countChar(String str, char ch) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==ch) {
				cnt++;
			}
		}
		return cnt;
	}
	
	//5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
	int indexValue(int[] ar, int index) {
		return ar[index];
	}
	
	//한글을 정수로 바꿔주는 메소드
		int changeHangeul(String hg) {
			String hangle = "공일이삼사오육칠팔구";
			String result = "";
			for (int i = 0; i <	hg.length(); i++) {
				result += hangle.indexOf(hg.charAt(i));
			}
			return Integer.parseInt(result);
		}
	//5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
		int[] getMaxMin(int[] ar) {
			int[] maxMin = new int[2];
			maxMin[0] = ar[0];
			maxMin[1] = ar[0];
			for (int i = 1; i < ar.length; i++) {
				maxMin[0] = maxMin[0]>ar[i] ? maxMin[0] : ar[i];
				maxMin[1] = maxMin[1]<ar[i] ? maxMin[1] : ar[i];
			}
			return maxMin;
		}
	//5개의 정수를 입력받고 최댓값과 최소값을 구해주는 메소드(void)
		
	//indexOf()
	int myIndexOf(String str, char ch) {
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==ch) {
				index= i;
				break;
			}
		}
		return index;
	}
		
	
	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		String a = mt.changeString("STrts");
		System.out.println(a);
		
		System.out.println(mt.countChar("STRstrsst", 'S'));
		int[] ar = {1,4,5,2,3};
		System.out.println(mt.getMaxMin(ar)[0]);
		
		System.out.println(mt.myIndexOf("strcsfcfe", 'c'));
		System.out.println("STRDTSDR".indexOf('D'));
		
	}
}
