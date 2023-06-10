package fileTest;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTest2 {
	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter(new File("test2.txt"));		//2byte(문자)단위로 데이터를 스트림으로 전송함
		
		fw.write("가나다라");
		fw.close();
		
		FileReader fr = new FileReader(new File("test2.txt"));
		System.out.println((char)fr.read());
	}
}
