package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {

	/*
	문제1) 1~100까지의 숫자중 3의배수 이거나 7의배수인 
	숫자의 합을 구하는 프로그램을 while, do~while, for문으로 
	각각 작성하시오. 단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 
	출력의 결과는 누적되는 모든 수를 콘솔에 print한다. 
	하나의 파일에 한꺼번에 작성하므로 동일한 결과가 3번 출력됩니다. 
	 */
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			if(i % 3 == 0 || i % 7 == 0) {
				sum += i;
			}
			if(i % 21 != 0) {
				sum -= i;
			}
			i++;
		}
		System.out.println("1~100까지의 3과 7의 배수의 합"
				+ " 중 공배수를 뺀 값은"+ sum);
		
		i = 1;
		sum = 0;
		do {
			if(i % 3 == 0 || i % 7 == 0) {
				sum += i;
			}
			if(i % 3 == 0 && i % 7 == 0) {
				sum -= i;
			}
			i++;
		} while(i <= 100);
		
		System.out.println("1~100까지의 3과 7의 배수의 합"
				+ " 중 공배수를 뺀 값은"+ sum);
		
		
		
		for(i = 1, sum = 0; i <= 100; i++) {
			if(i % 3 == 0 || i % 7 == 0) {
				sum += i;
			}
			if(i % 3 == 0 && i % 7 == 0) {
				sum -= i;
			}
		}
		

		System.out.println("1~100까지의 3과 7의 배수의 합"
				+ " 중 공배수를 뺀 값은"+ sum);
		
		
	}

}
