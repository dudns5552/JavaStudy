package ex04controlstatement;

public class EXE04DoWhile {

	public static void main(String[] args) {

		/*
		시나리오* E03 예제의 1~10까지 더하는 수열문제를 do~while문으로
		변경하여 구현하시오.
		 */
		int i = 0;
		int total = 0;
		do { total += i;
			i++;
		} while(i<=10);
				System.out.printf("1~10까지의 합은 %d%n", total);
				
				
		/*
		시나리오* 1부터 1000까지의 정수중 4의 배수이거나 7의 배수인 수의
		합을 구하여 출력하는 프로그램을 작성하시오.
		단, do~while문을 사용해야 한다.
		 */
//		int j = 0; //초기값 설정을 1로 했어야 했음.
//		int sum = 0;
//		do {
//		j++;
//		}while(j<=1000);
//			if (j % 4 == 0 || j % 7 == 0) {
//				sum += j;
//			} //if문이 두 블럭으로 들어갔어야 됐다. 잘못됨.
//			
//		System.out.printf("4나 7의 배수의 합은 : %d%n", sum);
				
		int total1 = 0;
		int j = 1;
		do {
			if(j%4 == 0 || j%7 == 0) {
				total1 += j;
			}
			j++;
		}while(j<=1000);
		System.out.println("1~1000사이 4or7의 배수합 : " + total1);
		
		
	}

}
