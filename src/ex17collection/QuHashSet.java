package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

/*
문제2] QuHashSet.java 
컬렉션 set에 저장된 객체를 이름으로 검색하자. 해당 정보가 있으면 해당 
어벤져스의 정보를 출력하고 없으면 "해당 영웅은 없어요ㅜㅜ" 라는 메시지 
출력해야 한다. 검색 부분은 Iterator를 통해 구현하도록 한다.

set계열의 컬렉션은 기본적으로 중복저장을 허용하지 않는다. 그러나 
아래와 같이 새롭게 정의한 클래스에 대해서는 equals(), hashCode()
 메소드를 적절히 오버라이딩 처리해야 중복을 제거할 수 있다. 메소드 
 오버라이딩을 통해 hero4 는 입력되지 않도록 Avengers 클래스를 업데이트 하시오.

 */
class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		int returnCode = Objects.hash(name, heroName);
		
		return returnCode;
	}
	
	@Override
	public boolean equals(Object obj) {
//		System.out.println("equals 호출됨");
		Avengers avg = (Avengers)obj;
		
		if(avg.name == this.name || avg.heroName == this.heroName)
			return true;
		else
			return false;
	}
}

public class QuHashSet {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 

		System.out.println("[최초 전체 정보출력]");
		for(Avengers av : set)
		{
			System.out.println(av.toString());			
		}
		
		System.out.println("검색할 이름을 입력하세요.");
		String taget = scanner.nextLine();
		//next로도 문자열 입력받기 가능 it.next하면 출력됨
		Iterator itr = set.iterator();
		boolean isFind = false;
		while(itr.hasNext() ) {
			Avengers seach = (Avengers) itr.next(); 
			if(taget.equals(seach.name) ||
					taget.equals(seach.heroName)) {
				System.out.println("== 요청하신 정보를 찾았습니다. ==");
				System.out.println(seach);
				isFind = true;
			}
		}
		if(isFind = false) {
			System.out.println("해당 영웅은 없어요ㅜㅜ");
		}
	}
	/*
	실행결과]
	
	중복 제거용 equals()메소드 호출
	[최초 전체 정보출력]
	Avengers [본명=스티브로져스, 닉네임=캡틴아메리카, 능력=비브라늄 방패]
	Avengers [본명=브루스배너, 닉네임=헐크, 능력=강한피부&점프]
	Avengers [본명=토니스타크, 닉네임=아이언맨, 능력=Mark-48 수트]
	검색할 이름을 입력하세욤:브루스배너
	Avengers [본명=브루스배너, 닉네임=헐크, 능력=강한피부&점프]
	요청하신 정보를 찾았습니다
	 */
}

