package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex06HashMapMain {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		
		/*
		객체저장
		 */
		System.out.println("name이라는 키값으로 저장된 이전의 값 : "
				+ map.put("name", "홍길동"));
		
		int number = 20;
		map.put("age", number);
		map.put("age", String.valueOf(number));
		map.put("gender", "남자");
		map.put("address", "가산디지털단지");
		System.out.println("저장된 객체의 수 : "+ map.size());
		
		/*
		중복저장
		 */
		System.out.println("name이라는 키값으로 저장된 이전의 값 : "+
				map.put("name", "최길동"));
		System.out.println("키값으로 중복 저장한 후의 객체의 수 : "+
				map.size());
		
		/*
		출력하기
			1. 키값을 알고있을때
		 */
		System.out.println("키값을 알때 : "+ map.get("name"));
		
		/*
			2. 키값을 모를때
		 */
		Set<String> keys = map.keySet();
		System.out.println("[확장for문 적용]");
		for(String key : keys) {
			String value = map.get(key);
			System.out.println(String.format("%s : %s",
					key, value));
		}
		
		/*
			3. 이터레이터를 통한 출력
		 */
		System.out.println("[이터레이터 사용하기]");
		Set<String> keys2 = map.keySet();
		Iterator<String> it = keys2.iterator();
		while(it.hasNext()) {
			String key = it.next(); //키값 얻기
			String value = map.get(key); //벨류값 얻기
			System.out.println(String.format("%s : %s"
					, key, value));
		}
		
		/*
		Value만 얻어와야 할때
		 */
		System.out.println("[Value값들만 출력하기]");
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		/*
		존재유무확인
		 */
		System.out.println(map.containsKey("name")
				? "name 키값 있다." : "name 키값 없다.");
		System.out.println(map.containsKey("account")
				? "account 키값 있다." : "account 키값 없다.");
		System.out.println(map.containsValue("남자")
				? "남자 있다." : "남자 없다.");
		System.out.println(map.containsValue("여자")
				? "여자 있다." : "여자 없다.");
			
		
		/*
		삭제
		 */
		System.out.println("삭제된 객체 : "+ map.remove("age"));
		System.out.println("[age키값을 삭제후 출력]");
		for(String key : keys) {
			System.out.println(String.format("%s : %s"
					, key, map.get(key)));
		}
		
		/*
		전체삭제
		 */
		map.clear();
		System.out.println("전체삭제후 객체수 : "+ map.size());
		
	}

}
