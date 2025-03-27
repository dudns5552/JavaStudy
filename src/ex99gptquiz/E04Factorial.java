package ex99gptquiz;

import java.util.Scanner;

public class E04Factorial {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int N = scan.nextInt();
		
		int total = 1;
		for(int i = 1 ; i <= N ; i++) {
			total *= i;
		}
		
		System.out.printf("%d!= %d",N , total);
		
		scan.close();
		
	}
}
