package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTest4 {
		public static void main(String[] args) throws Exception{
			BufferedWriter bw = new BufferedWriter(new FileWriter("test4.txt",true)); //true매개변수 사용시 파일에덮어쓰지않고 이어씀
//			
//			//줄 바꾸고 싶으면 \n사용
//			bw.write("\ntest123");
//			//2.줄 바꾸고 싶으면 newLine()을 사용
//			bw.newLine();					
//			bw.close();
			BufferedReader br = new BufferedReader(new FileReader("test4.txt"));
			String line = null;	
			//기본적으로 readLine()은 한 줄씩 가져오지만 개행문자 \n을 가져오지 않음
			while((line = br.readLine())!=null) {
				System.out.println(line); 
			
			}
			br.close();
		}
}
