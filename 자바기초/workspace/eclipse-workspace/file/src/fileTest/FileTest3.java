package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTest3 {
	public static void main(String[] args) throws Exception{
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("test3.txt")));
		
		bw.write("테스트3이다.");
		//버퍼를 비운다 -> 버퍼에 있는 데이터를 전송한다.
		bw.flush();								//flush는 생략이 가능 close()하면 자동으로 된다.
		bw.close();
		BufferedReader br = new BufferedReader(new FileReader(new File("test3.txt")));
		System.out.println(br.readLine());
	}
}
