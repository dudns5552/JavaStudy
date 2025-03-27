
package ex02variable;

import java.util.Random;

public class RSP_Game {

	public static void main(String[] args) {
		
		/*
		가위 바위 보 게임의 규칙
		바위는 가위한테 이기고 보한테 진다.
		가위는 보한테 이기고 바위한테 진다.
		보는 바위한테 이기고 가위한테 진다.
		 */
		int computer, user;
		final int ROCK = 0;
		final int SCISSOR = 1;
		final int PAPER = 2;
		
		Random random = new Random();
		user = 2;
		int computer1;
		computer1 = random.nextInt(3);		
		
		if (computer1 == user) {
			System.out.println("비겼습니다.");
		} else if(computer1 == 0 && user == 1) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else if (computer1 == 1 && user == 2) {
			System.out.println("컴퓨터가 이겼습니다.");
		} else if (computer1 == 2 && user == 0) {
			System.out.println("컴퓨터가 이겼습니다.");
			
		} else if (computer1 == 0 && user == 2) {
			System.out.println("이겼습니다.");
		} else if (computer1 == 1 && user == 0) {
			System.out.println("이겼습니다.");
		} else if (computer1 == 2 && user == 1) {
			System.out.println("이겼습니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}
}
