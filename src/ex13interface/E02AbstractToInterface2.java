package ex13interface;

/*
추상클래스를 인터페이스로 변경하기
	abstract class => interface
	메서드인 경우 public abstract 제거
	멤버변수인 경우 public static final 제거
 */
interface IPersonalNumberStorage {
	 void addPersonalInfo(String juminNum,
			String name);
	 String searchPersonalInfo(String juminNum);
}

/*
VO(Value Object): 값만 저장할 수 있는 객체라는 뜻으로 데이터 저장용
	클래스가 필요할때 사용한다.*/
class PersonalInfoVO {
	private String name;
	private String juminNum;
	
	public PersonalInfoVO(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
	}
	
	public String getName() { return name; }
	public String getJuminNum() {return juminNum; }
	public void setName(String name) { this.name = name; }
	public void setJuminNum(String JuminNum) { 
		this.juminNum = JuminNum;}
}

/*
클래스가 클래스를 상속할때 -> extends
클래스가 인터페이스를 상속할때 -> implements
매우 드물지만 인터페이스가 인터페이스를 상속할때 -> extends
extends 는 '상속', implements는 '구현'이라 표현한다.
 */
class PersonalNumberStorageImpl 
					implements IPersonalNumberStorage {
	
	PersonalInfoVO[] personalArr;
	int numOfperInfo;
	public PersonalNumberStorageImpl(int arrSize) {
		personalArr = new PersonalInfoVO[arrSize];
		numOfperInfo = 0;
	}
	
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numOfperInfo] = new PersonalInfoVO(name, juminNum);
		numOfperInfo++;
	}
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i = 0 ; i < numOfperInfo ; i++) {
			if(juminNum.compareTo(personalArr[i].getJuminNum()) == 0)
			{
				return personalArr[i].getName();
			}
		}
		return null;
	}
}

public class E02AbstractToInterface2 {

	public static void main(String[] args) {
		
		PersonalNumberStorageImpl storage =
				new PersonalNumberStorageImpl(10);
		
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
	}
	
}
