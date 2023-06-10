package arrayTest;
	
public class ArrTest {
	public static void main(String[] args) {
		int[][] arrData = {{2,3,4},{5,2,1}};
		int length = 0;
		
		for (int i = 0; i < arrData.length; i++) {
			length = arrData[i].length;
		}
		
		for (int i = 0; i < length; i++) {
			System.out.println(arrData[i/3][i%3]);
		}
		
		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arrData[i].length; j++) {
				System.out.println(arrData[i][j]);
			}
		}
	}
}	
