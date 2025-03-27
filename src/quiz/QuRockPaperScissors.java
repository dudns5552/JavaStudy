package quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
승부를 판단하여 출력한다.
1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.
 */
public class QuRockPaperScissors {

	/*
	 실행결과]
무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : 1
사용자 : 가위, 컴퓨터 : 보
이겼습니다.

무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : 4
가위바위보 할줄 모르세요? 제대로 내세요^^;

….게임진행...

5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : 1

….게임재시작…

5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : 0
게임이 종료되었습니다. 감사합니다.

….게임종료….

5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : 5
잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요.

	 */
	
	
	public static void main(String[] args) {
		
		
		final int ROCK = 1;
		final int SCISSOR = 2;
		final int PAPER = 3;
		
		Random random = new Random();
		int computer1 = random.nextInt(3)+ 1;		
		System.out.println("컴퓨터 : "+ computer1);
		
		int user1 = user();
		
		for(int i = 1 ; i <= 5 ; i++) {
			
			if (computer1 == user1) {
				System.out.println("비겼습니다.");
				
			} else if(computer1 == ROCK && user1 == SCISSOR) {
				System.out.println("졌습니다.");
			} else if (computer1 == SCISSOR && user1 == PAPER) {
				System.out.println("졌습니다.");
			} else if (computer1 == PAPER && user1 == ROCK) {
				System.out.println("졌습니다.");
				
			} else if (computer1 == ROCK && user1 == PAPER) {
				System.out.println("이겼습니다.");
			} else if (computer1 == SCISSOR && user1 == ROCK) {
				System.out.println("이겼습니다.");
			} else if (computer1 == PAPER && user1 == SCISSOR) {
				System.out.println("이겼습니다.");
			}
		}
		conEnd();
	}
	
	static int user ()  {
		Scanner sc2 = new Scanner(System.in);
		int a;
		for(a = sc2.nextInt() ; 0 < a && a <= 3 ;) {
			try {
				System.out.println("무엇을 내겠습니까? (1: 가위, 2:바위, 3:보)");
			}
			catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
			}
			if(a < 0 && 3 < a) {
				System.out.println("가위바위보 할줄 모르세요? 제대로 내세요^^;");
				return user();
			}
		}
		return a;
	}
	static void conEnd() {
		Scanner sc3 = new Scanner(System.in);

		for(int ce = sc3.nextInt() ; 0 <= ce && ce <= 1 ;) {
			try {
				System.out.println("5번의 게임이 끝났습니다."
						+ " 게임을 계속 하시겠습니까? 재시작(1), 종료(0)");
			}
			catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
			}
			if(ce < 0 && 1 < ce) {
				System.out.println("잘못입력 하셨습니다. 재시작(1)"
						+ "종료(0)중에 입력하세요");
			}
			else if(ce == 1) {
				
			}
			else {
				System.out.println("게임을 종료합니다. 감사합니다.");
				System.exit(0);
			}
		}
		
	}
}
