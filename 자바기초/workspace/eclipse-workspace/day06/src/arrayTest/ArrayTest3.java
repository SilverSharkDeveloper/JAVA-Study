package arrayTest;

public class ArrayTest3 {
	public static void main(String[] args) {
		int [][] arr = new int[][] {{3,4,5},{1,2,3}};
		
		for(int i = 0 ; i<arr.length ; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
	}
}