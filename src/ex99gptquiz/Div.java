package ex99gptquiz;

import java.util.Scanner;

public class Div {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int n = scan.nextInt();

		if(n % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
	}
}
