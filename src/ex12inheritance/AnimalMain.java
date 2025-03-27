package ex12inheritance;

//AnimalMain 클래스 정의 : main함수를 그대로 붙여넣기 해서 사용하세요.

public class AnimalMain {

	public static void main(String[] args) {
		
		//강아지 객체생성
		Dog dog = new Dog("포유류",2,
				"수컷","포매라니안","뽀미");
		
		dog.showAnimal();
		System.out.println("====================");
		dog.bark();
		System.out.println("====================");
		dog.showDog();
	}

}
