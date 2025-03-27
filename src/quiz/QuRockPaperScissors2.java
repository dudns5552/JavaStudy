package quiz;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class QuRockPaperScissors2 {

	public static void main(String[] args) {
		
		
		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		
		int computer = 0, user = 0;
		
		
		for(int i = 01; i <= 5 ; i++) {
			try {
				//컴퓨터 임의값 입력
				Random random = new Random();
				computer = random.nextInt(3) + 1;
//				System.out.println(computer);
				
				//유저 값 입력
				Scanner sc = new Scanner(System.in);
				System.out.println("무엇을 내시겠습니까?(1: 가위, 2:바위, 3:보)");
				user = sc.nextInt();
			}
			//문자 및 문자열 입력시 
			catch(InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
			}
			
			if(user < 1 || 3 < user) {
				System.out.println("가위바위보 할줄 모르세요? 제대로 내세요^^;");
				main(args);
			}
			else if(user == SCISSOR && computer == ROCK) {
				System.out.println("졌습니다.");
			}
			else if(user == SCISSOR && computer == PAPER) {
				System.out.println("이겼습니다.");
			}
			else if(user == ROCK && computer == SCISSOR) {
				System.out.println("이겼습니다.");
			}
			else if(user == ROCK && computer == PAPER) {
				System.out.println("졌습니다.");
			}
			else if(user == PAPER && computer == ROCK) {
				System.out.println("이겼습니다.");
			}
			else if(user == PAPER && computer == SCISSOR) {
				System.out.println("졌습니다.");
			}
			else if(user == computer) {
				System.out.println("비겼습니다.");
			}
			else {
				System.out.println("잘못된 입력입니다.");
				main(args);
			}
		}
		
		ending();
	}
	
	public static void ending() {
		try {		
			Scanner ce = new Scanner(System.in);
			
			System.out.println("5번의 게임이 끝났습니다. 게임을 "
					+ "계속하시겠습니까? 재시작(1), 종료(0)");
			
			for(int ce2 = ce.nextInt() ; ce2 != 0 || ce2 != 1 ;) {
				if(ce2 == 1) {
					main(null);
				}
				else if(ce2 == 0) {
					System.exit(0);
				}
				else {
					System.out.println("잘못입력하셨습니다. 재시작(1), "
							+ "종료(0)중에 입력하세요.");
					ce2 = ce.nextInt();
				}
			}
		}
		catch(InputMismatchException e) {
			System.out.println("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요.");
		}
	}
}