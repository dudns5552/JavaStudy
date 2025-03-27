package ex04controlstatement;

public class QuPyramid03 {

	public static void main(String[] args) {

		int rows = 4; // 피라미드 높이

	        for (int i = 0; i < rows; i++) { //i는 행을 의미
	        	
	            // 공백 출력 (왼쪽 정렬)
	            for (int j = 0; j < rows - i - 1; j++) {
	                System.out.print("  ");
	            }
	            
	            // 별 출력
	            for (int k = 0; k < 2 * i + 1; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
			
	}
	}
}
