package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTest{
	//절대 경로: 어디에서 작성해도 찾아갈 수 있는 경로 C:/a/b
	//상대 경로: 현재 위치에 따라서 변경되는 경로 .(현재경로) ..(이전경로)
	
	public static void main(String[] args)  throws Exception{
//		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt",true));
//		
//		bw.write("안녕하세요\n");
//		bw.close();
//		//close 해야 flush -> 출력이댐
//		
		
		
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		String line = null;
		while((line = br.readLine())!=null) {
			System.out.print(line);
		}
		
		
		br.close();
	}
	
	
}
