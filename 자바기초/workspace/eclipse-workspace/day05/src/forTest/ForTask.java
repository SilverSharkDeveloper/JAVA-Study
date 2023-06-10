package forTest;

public class ForTask {
public static void main(String[] args) {
	for(int i =0; i<100;++i) {
		System.out.println(i+1);
	}
	for(int i =0; i<100;++i) {
		System.out.println(100-i);
}

	for(int i =0 ; i < 100; i +=2) {
		System.out.println(i+2);
	}
	for(int i =1; i<101;++i) {
		System.out.println(3*i);
	}
	
//	for(char i =65; i<72;++i){
//	
//		System.out.print(i);
//	}
	for(int i = 0; i<6 ; ++i) {
		System.out.println((char)(i+'A'));				//정수와 문자의 연산은 정수다.	//정수와 문자의 연산은 정수다.
	}
	
	
System.out.println();


	for (char i = 0; i < 26; ++i) {
		
		System.out.print((char)(i+'A'));
		System.out.print((char)(i+'a'));
																									//문자열 붙여쓰는방법 ???????
		                          																		//for , if같은 문장안에서의 형변환은 필수
		
	}
System.out.println();

	for(int i = 0; i<26 ; ++i) {
		System.out.print((char)(i%2==0 ? i +'A': i + 'a'));
	}
	
	int ac = Integer.parseInt("11");
	System.out.println(ac);
	
	return;
}
//65~90 97~122
}