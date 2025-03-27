package ex12inheritance;

public class DogT extends AnimalT {
	
	//멤버변수
		public String dogKind;//강아지의 종류  
		public String name;//이름 
		
		//강아지가 짖는것을 표현 
		//멤버변수가 public으로 선언된 경우 직접 사용한다. 
//		void bark() {
//			//자식쪽의 멤버변수와 부모쪽의 멤버변수를 각각 사용함 
//			System.out.printf("\n이름이 %s이고 종이 %s인 강아지가 짖는다\n", 
//					this.name, super.species);
//		}	 
		/* 멤버변수가 private으로 선언되면 직접 접근이 안되므로 getter를 통해
		값을 반환받아야 한다. */
		void bark() {
			System.out.printf("\n이름이 %s이고 종이 %s인 강아지가 짖는다\n", 
					this.name, super.getSpecies());
		}
		
		//현재상태 
		void showDog() {		 
			super.showAnimal();
			System.out.println("종류는:"+ dogKind);
			System.out.println("이름은:"+ name);
		}
		
		//생성자 
		public DogT(String species, int age, String gender, 
				String dogKind, String name) {
			//부모 클래스인 Animal의 생성자를 호출  
			super(species, age, gender);
			//자식 인스턴스 초기화 
			this.dogKind = dogKind;
			this.name = name;
		}

}
