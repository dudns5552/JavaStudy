package ex12inheritance;

/*
Dog 클래스 정의
	강아지를 표현한 클래스 
	- Dog is a Animal이 성립하므로 상속관계로 표현하기에 
		적합한 모델	
	멤버변수
		강아지의종류 : 푸들, 포매라니안 등 -> dogKind
		이름 -> name
	멤버메소드
		bark() : 강아지가 짖는것을 표현
			출력결과 : 이름이 XX이고 종(포유류)이 
				YY인 강아지가 짖는다.
		showDog() : 강아지의 현재상태(멤버변수)를 출력하는 
			메소드
	인자생성자
		: 부모클래스까지 초기화할수 있도록 구성할 것
 */
public class Dog extends Animal {
	
	public String dogKind;
	public String name;
	
	
	public Dog(String species, int age, String gender, 
			String dogKind, String name) {
		super(species, age, gender);
		this.dogKind = dogKind;
		this.name = name;
	}
	
	public void bark() {
		System.out.printf("이름이 %s이고 종이 %s인 강아지가 짖는다%n"
				, name, super.getSpecies());
	}
	public void showDog() {
		System.out.println("==강아지 정보==");
		showAnimal();
		System.out.println("강아지종 : "+ dogKind);
		System.out.println("이름 : "+ name);
		
	}

}
