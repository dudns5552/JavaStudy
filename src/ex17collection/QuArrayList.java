package ex17collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

/*
문제1) QuArrayList.java 
사용자로부터 이름을 입력받아 그 이름으로 검색해서 인덱스 위치(indexOf사용)를 
알아내서 해당 인덱스로 그 객체를 삭제하고 삭제된 객체의 정보(이름,나이,학번)를 
출력하여라.
 */

/*
구상도
1. 입력받기 (nextLine)
2. 검색 및 위치확인 (equals, indexOf)
3. 해당 인덱스의 인스턴스 삭제
4. 삭제된 객체의 인자 출력 
 */

public class QuArrayList {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Student> list = new ArrayList<Student>();
//		LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
			
		//1.검색할 이름을 입력받음
		Scanner scan = new Scanner(System.in);
		System.out.println("검색하실 이름을 입력하세요 : ");
		String taget = scan.nextLine();
			
		//2.확장for문으로 컬렉션 전체를 접근
		int idx = -1;
		try {
		for(Student st : list) {
			
			//3.검색결과 유/무에 따라
			if(taget.equals(st.getName())) {
			idx = list.indexOf(st);
			}
			//검색결과 있을때…검색된 데이터 삭제
			if(0 <= idx) {
				System.out.println("검색되었습니다");
				
				System.out.println("삭제하시겠습니까? (1)삭제 (0)취소");
				int del = scan.nextInt();
				if(del == 1) {
					Student st5 = list.get(idx);
					list.remove(idx);
					System.out.println("정보가 삭제되었습니다.\n"+ st5);
				}
				else if(del == 0) {
					System.out.println("취소되었습니다.");
					main(args);
				}
			}
		}
		}
		catch(Exception e) {
			e.getMessage();
		}
		//검색결과 없을때...검색결과가 없다고 출력
		if(idx == -1) {
			System.out.println("찾으시는 데이터가 없습니다.");
		}
		
		//4.전체정보 출력
		System.out.println("[전체정보 출력]");
		for(Student stu : list) {
			System.out.println(stu);
		}
		
	}
	/*
	실행결과]
	
	검색할 이름을 입력하세요:가길동
	[검색되었습니다]
	[삭제후 정보출력]
	이름:나길동, 나이:20, 학번:2017
	이름:다길동, 나이:30, 학번:2016
	이름:마길동, 나이:40, 학번:2015
	 */
}

