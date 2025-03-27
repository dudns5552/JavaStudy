package ex04controlstatement;

public class EXE01If02 {

	public static void main(String[] args) {

		/*
		시나리오* 숫자를 홀/짝인지 먼저 판단한 후 100 이상인지를 판단하는
		프로그램을 if~else문으로 작성하시오
		 */
		int number = 130;
		
		if(number%2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		if(number >= 100) {
			System.out.println("100이상");
		}
		else {
			System.out.println("100미만");
		}
		
	}

}
