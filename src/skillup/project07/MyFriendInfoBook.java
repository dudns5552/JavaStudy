package skillup.project07;

import java.util.Scanner;

public class MyFriendInfoBook {

	public static Scanner scan = new Scanner(System.in);
	
	public static void menuShow() {
		System.out.println(
				"########## 메뉴를 입력하세요(ver06)##########");
		System.out.print("1. 고딩친구입력 ");
		System.out.println("2. 대딩친구입력");
		System.out.print("3. 전체정보출력 ");
		System.out.println("4. 간략정보출력");
		System.out.print("5. 검색 ");
		System.out.print("6. 삭제 ");
		System.out.println("7. 프로그램종료");
		System.out.print("메뉴선택 >>>");
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		FriendInfoHandler handler = new FriendInfoHandler(100);
		
		while(true) {
			//제일 먼저 메뉴를 출력한다.
			menuShow();
			try {
				int choice = scan.nextInt();
				scan.nextLine();
				switch(choice) {
				case 1: case 2:
					//친구의 정보 입력(고딩/대딩)
					handler.addFriend(choice);
					break;
				case 3:
					//정보 전체(4가지) 출력
					handler.showAllData();
					break;
				case 4:
					//정보 간략(2가지) 출력
					handler.showSimpleData();
					break;
				case 5:
					//정보 검색
					handler.searchInfo();
					break;
				case 6:
					//정보 삭제
					handler.deleteInfo();
					break;
				case 7:
					System.out.print("프로그램종료");
					return;
				} //switch 끝
			}
			catch (Exception e) {
				System.out.println("[예외발생]메뉴선택은 숫자만 입력해주세요.");
				scan.nextLine();
			}
		} //while 끝
	} //main 끝
} //class 끝
