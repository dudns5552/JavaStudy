package quiz;

import java.util.Random;
import java.util.Scanner;

/*
컴퓨터는 1~100사이의 숫자 하나를 생성한다.
총 시도횟수는 7번을 부여한다.
사용자는 7번의 시도안에 숫자를 맞춰야 한다.
사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
메서드를 사용하여 구현한다.

 */

public class QuUpDownGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int com = 0;
		int user = 0;
		com = rd.nextInt(100)+1;
		System.out.println(com);
		
		for(int i = 1 ; i <= 7 ; i++) {
			
			System.out.println("숫자를 입력하세요 : ");
			user = sc.nextInt();
			if(user == com) {
				System.out.println("정답입니다.");
				user = com;
				break;
			}
			else if(user < 0 || 100 < user ) {
				System.out.println("잘못입력하셨습니다.");
				main(args);
			}
			else if(user < com) {
				System.out.println("UP");
			}
			else if(user > com) {
				System.out.println("DOWN");
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		if(user != com) {
			System.out.println("실패입니다.");
		}
		System.out.println("게임을 계속하시겠습니까? 1. 계속 0. 종료");
		int conEnd = sc.nextInt();
		if(conEnd == 1) {
			main(args);
		}
		else if(conEnd == 0) {
			System.exit(0);
		}
	}
	/*
	실행결과]
	생성된난수:36
	1~100사이의 정수를 입력하세요:99
	Down입니다.
	1~100사이의 정수를 입력하세요:11
	Up입니다.
	1~100사이의 정수를 입력하세요:36
	정답입니다.
	승리하셨습니다.
	게임을 다시 시작할까요?
	1.게임재시작, 0:게임종료
	0
	감사합니다. 프로그램을 종료합니다.
	※생성된 난수를 출력하는 이유는 빠른 테스트를 위한 부분입니다.
	 */
}

