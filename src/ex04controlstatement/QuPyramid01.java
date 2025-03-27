package ex04controlstatement;

public class QuPyramid01 {

	public static void main(String[] args) {

		int i = 1;
		while(i <= 5) {
			int  j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
			
	}

}
