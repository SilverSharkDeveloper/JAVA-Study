package fileTest;

import java.io.File;
import java.io.FileOutputStream;

public class FileTest {
	public static void main(String[] args) throws Exception{
		//절대 경로 : 내가 어디에 위치해 있든 무조건 찾아가는 경로
		//상대 경로 : 내가 있는 위치에 따라 변하는 경로 -> ..(이전경로)  .(현재 경로)
		
		File f = new File("test.txt");
		
		//f.createNewFile();
//		f.delete();
		FileOutputStream fos = new FileOutputStream(f);
		fos.write('a');
		fos.close();
	}
}
