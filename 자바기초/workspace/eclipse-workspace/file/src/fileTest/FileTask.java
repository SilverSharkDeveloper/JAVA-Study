package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTask {
	public static void main(String[] args) throws Exception{
		/*
		 * 현재 경로에 animal.txt 파일을 생성하고,
		 * 파일 내용은 사슴, 고라니, 너구리 ,토끼 를 작성한다.
		 * 각 동물은 줄바꿈 후 다음 동물을 넣도록한다.
		 * 반복문을 사용하여 데이터를 출력한다.
		 */
		BufferedWriter bw = new BufferedWriter(new FileWriter("animal.txt",true));
		bw.write("사슴\n");
		bw.write("고라니\n");
		bw.write("너구리\n");
		bw.write("토끼");
		/*
		 * String [] animals = {"사슴","토끼","고라니","너구리"};
		 * for(int i = 0 ; i<animals.length ; i++){
		 * 	bw.write(animals[i]	);
		 * 	bw.newLine();
		 */
		
		bw.close();
		BufferedReader br = new BufferedReader(new FileReader("animal.txt"));
		String animal = null;
		while((animal = br.readLine())!=null) {
			System.out.println(animal);
		}
		br.close();
	}
}
