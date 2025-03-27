package ex17collection;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

import common.Teacher;

public class Ex04HashSet1 {

	public static void main(String[] args) {
		
		HashSet<Object> set = new HashSet<Object>();
		
		String varString1 = "JAVA";
		String varString2 = new String("개발자");
		Date varDate = new Date();
		int varInt = 100;
		Teacher varTeacher = new Teacher("김봉두", 55, "체육");
		
		/*
		객체저장
		 */
		System.out.println("add결과 : "+ set.add(varString1));
		set.add(varString2);
		set.add(varDate);
		set.add(varInt);
		set.add(varTeacher);
		
		System.out.println("[중복 저장전 객체수] : "
				+ set.size()); //5개
		System.out.println(set.add(varString2) 
				? "저장성공" : "저장실패");
		System.out.println("[중복 저장후 객체수] : "+ set.size());
		
		/*
		이터레이터를 통한 객체 출력
		 */
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Object object = itr.next();
			if(object instanceof Teacher) {
				System.out.println("Teacher객체 =>"+ ((Teacher)object).getName());
			}
			else {
				System.out.println("저장된객체 : "+ object);
			}
		}//end of while
		
		/*
		포함여부 확인
		 */
		System.out.println(set.contains(varString1)
				? "varString1 있음" : "varString1 없음");
		
		/*
		객체삭제
		 */
		System.out.println(set.remove(varString2)
				? "varString2 삭제 성공" : "varString2 삭제 실패");
		
		/*
		전체삭제
		 */
		set.clear();
		System.out.println("전체삭제 : "+ set.removeAll(set));
		System.out.println("[전체 삭제 후 객체 수] : "+ set.size());
	}
}
