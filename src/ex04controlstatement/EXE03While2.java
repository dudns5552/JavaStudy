package ex04controlstatement;


import java.util.Scanner;

public class EXE03While2 {

	public static void main(String[] args) {

		/*
		시나리오* 1~10까지의 합을 구하는 프로그램을 while문으로 작성하시오
		 */
		
		int i = 1;
		int sum = 0; //sum 값을 정해야 된다.
		while(i <= 10) {
			 System.out.println("변수i= " + i);
			 sum += i;
			 i++;
		}
		
		System.out.println("1~10까지의 합 sum= "+ sum);
		
		/*
		시나리오* 1~100까지의 정수중 3의 배수이거나 4의 배수인
		정수의 합을 구하는 프로그램을 while문을 이용해서 작성하시오.
		 */
		// %3 %4를 햇을때 나머지가 0인 수
			// 그 정수들의 합
		
		i = 1;
		int sum1, sum2, total;
		sum1 = 0;
		sum2 = 0;
			
		while (i <= 100) {
			if (i%3 == 0) {
				sum1 += i;
			}
			else if (i%4 == 0) {
				sum2 += i;
			}
			i++;
		}
		
		System.out.printf("1~100의 3의 배수의 합은 %d%n", sum1);
		System.out.printf("1~100의 4의 배수의 합은 %d%n", sum2);
		
		total = sum1 + sum2;
		System.out.printf("1~100중 3이나 4의 배수의 합은 %d%n", total);
		
		/*
		시나리오* 구구단을 출력하는 프로그램을 while문으로 작성하시오
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int l = 1;
		int total2 = 0;
		int k = scanner.nextInt();
		System.out.printf("구구단을 실행할 숫자는 %d단 입니다.%n", k);
		
		while (l <= 9) {
			total2 = k * l;
			System.out.printf("%d*%d은 %d%n", k, l, total2);
			l++;
		}
		
		/*
		시나리오* 아래와 같은 모양을 출력하는 while문을 작성하시오
			출력결과
			1 0 0 0
			0 1 0 0
			0 0 1 0
			0 0 0 1
		 */
		int x = 1;
		while (x <= 4) {
			int y = 1;
			while(y <= 4) {
				if(x == y) {
				System.out.print("1 ");
				}
				else {
				System.out.print("0 ");
				}
				y++;
			}
		System.out.println();
		x++;
		}
	}

}
