package skillup.project07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import ex99gptquiz.Scan;

public class FriendInfoHandler {
	
	Scanner scan = new Scanner(System.in);
	private ArrayList<Friend> myFriends;
	
	//생성자
	public FriendInfoHandler(int num) {
		myFriends = new ArrayList<Friend>();
	}
	
	//연락처 정부 추가를 위한 메서드
	public void addFriend(int choice) {
		
//		System.out.println("## addFriend 호출됨 ##");
		
		//공통정보 3가지를 먼저 입력받는다.
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.print("이름 : "); 
		iName = MyFriendInfoBook.scan.nextLine();
		System.out.print("전화번호 : "); 
		iPhone = MyFriendInfoBook.scan.nextLine();
		System.out.print("주소 : "); 
		iAddr = MyFriendInfoBook.scan.nextLine();
		
		if(choice == 1) {
			System.out.print("별명 : "); 
			iNickname =	MyFriendInfoBook.scan.nextLine();
			
			HighFriend high = new HighFriend
					(iName, iPhone, iAddr, iNickname);
			myFriends.add(high); 
		}
		
		else if(choice == 2) {
			System.out.print("전공 : "); iMajor =
					MyFriendInfoBook.scan.nextLine();
			
			myFriends.add(new UnivFriend
					(iName, iPhone, iAddr, iMajor));
					
		}
		System.out.println("##친구정보 입력이 완료되었습니다.##");
	}
	
	//전체 정보 출력
	public void showAllData() {
//		System.out.println("## showAllData 호출됨 ##");
		for(int i = 0; i < myFriends.size(); i++) {
				myFriends.get(i).showAllData();
			}
		System.out.println("##전체정보가 출력되었습니다.");
	}
	
	//간략 정보 출력
	public void showSimpleData() {
//		System.out.println("## showSimpleData 호출됨 ##");
		for(Friend friend : myFriends) {
				friend.showBasicInfo();
			}
		System.out.println("##간략정보가 출력되었습니다.");
	}

	//정보 검색
	public void searchInfo() {
//		System.out.println("searchInfo 호출됨");
		
		boolean isFind = false;
		System.out.print("검색할 이름을 입력하세요 : ");
		String searchName = scan.nextLine();

		//이터레이터 인스턴스 생성
		Iterator<Friend> itr = myFriends.iterator();
		//인출할 인스턴스가 있는지 확인
		while(itr.hasNext()) {
			//인출
			Friend friend = itr.next();
			//인출된 인스턴스와 이름을 통해 비교
			if(searchName.compareTo(friend.name) == 0) {
				//일치하는 경우 정보 출력
				friend.showAllData();
				System.out.println("## 귀하가 요청하는"
						+ " 정보를 찾았습니다. ##");
				//정보를 찾았다면 true로 변경
				isFind = true;
			}
		}
		
		if(isFind == false)
			System.out.println("##찾는 정보가 없습니다.##");
	}

	public void deleteInfo() {
//		System.out.println("## deleteIno 호출됨 ##");
		System.out.print("삭제할 이름을 입력하세요. : ");
		String deleteName = scan.nextLine();
		//삭제 여부 판단
		int deleteIndex = -1;
		//확장 for문으로 반복
		for(Friend friend : myFriends) {
			//삭제할 이름이 있는지 검색
			if(deleteName.equals(friend.name)) {
				//참조값을 통해 삭제
				myFriends.remove(friend);
				//삭제되었다면 0으로 변경
				deleteIndex = 0;
				break;
			}
		}
		
		/*
		자동 인덱싱이 지원되므로 삭제후 데이터를 앞으로 당겨오는 과정을
		안해도 된다.
		 */
		if(deleteIndex == -1) {
			System.out.println("## 삭제된 데이터가 없습니다. ##");
		}
		
		else{
			System.out.println("## 삭제되었습니다. ##");
		}
	}
}
