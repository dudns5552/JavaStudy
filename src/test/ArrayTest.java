package test;

public class ArrayTest {
	public static void main(String[] args) {
	
		int[] arr = new int[5];
		System.out.println(arr[0]);
		
		int[][] arr2 = new int[2][4];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j<4; j++) {
				arr2[i][j] = ((int)Math.random()*100);
			}
		}
		
	}
	
	static void twoDimplus(int[][] arr2, int plusNum) {
		for(int i = 0; i < 2 ; i++) {
			for(int j = 0; j < 4; j++) {
				arr2[i][j] += plusNum;
			}
		}
	}
}
