package ex04controlstatement;

public class E04DoWhile2 {

	public static void main(String[] args) {

		/*
		시나리오* E03 예제의 1~10까지 더하는 수열문제를 do~while문으로
		변경하여 구현하시오.
		 */
		int i = 0;
		int sum = 0;
		do {
			sum += i;
			i++;
		} while(i<=10);
		System.out.printf("1~10까지의 누적합;"+ sum);
	}

}
