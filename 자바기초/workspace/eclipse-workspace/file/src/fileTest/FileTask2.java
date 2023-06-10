package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTask2 {
	public static void main(String[] args) throws Exception{
//		String[] animals = {"독수리","참새","닭","비둘기"};
//		BufferedWriter bw = new BufferedWriter(new FileWriter("animal2.txt"));
//		
//		for(String animal :animals) {
//			bw.write(animal);
//			bw.newLine();
//		}
//		bw.close();
		
		//닭을 불사조로 수정하기
		BufferedReader	br = new BufferedReader(new FileReader("animal2.txt"));
		String line = null; //주소값을 부름
		String tmp	=	"";	//문자열 연결하기위해
		while((line = br.readLine())!=null) {
			tmp +=	line.equals("닭")? "불사조\n" : line + "\n";//\n은 가져오지 않기때문
		}
		System.out.println(tmp);
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("animal2.txt"));
		bw.write(tmp);
		bw.close();
	}
}
