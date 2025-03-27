package ex12overriding;

/*
문제5) QuBuyHamburger.java
햄버거를 추상화한 클래스와 기본가격, 세트가격을 추상화한 클래스를 정의하여 햄버거를 주문시 기본가격 혹은 세트가격으로 출력할수 있도록 프로그램을 구현하시오. 
조건은 다음과 같다. 

햄버거
	멤버변수 : 버거명, 가격, 패티, 소스, 야채
	인자생성자 
	멤버메소드 : 가격반환(getter), 햄버거정보출력
	
햄버거 기본가격 : 햄버거 + 음료 + 프렌치프라이의 합계
	멤버변수 : 햄버거종류(객체), 음료가격(1000원으로 고정), 프렌치프라이가격(1500원으로 고정)
	인자생성자
	멤버메소드 : 기본가격계산, 결제금액출력

세트가격 : 기본가격클래스를 상속받음. 기본가격에서 500원 할인된 금액으로 계산
	멤버변수 : 없음
	인자생성자
	멤버메소드 : 세트가격계산(Overriding), 결제금액출력(Overriding)
 */
class Burger2 {
	//멤버변수
	/* 버거명, 가격, 패티, 소스, 야체을 표현 */
	String burN;
	private int price;
	String patty;
	String sauce;
	String veg;
	
	
	//인자생성자
	public Burger2() {}
	public Burger2(int price) {
		this.price = price;
	}
	public Burger2(String burN, int aprice, String patty
			, String sauce, String veg) {
		this.burN = burN;
		this.price = aprice;
		this.patty = patty;
		this.sauce = sauce;
		this.veg = veg;
	}


	//getter : price만 필요
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	};
	
	//햄버거 정보 출력
	/* 버거명, 가격, 식재료 출력*/
	void showHamInfo() {
		System.out.println(burN);
		System.out.println("가격 : "+ price);
		System.out.printf("식재료 : %s, %s, %s"+ patty, sauce, veg);
	}
}

//햄버거의 기본가격 추상화 
class HamburgerPrice2 {
	//멤버변수
	/* 햄버거종류, 음료, 프렌치프라이 */
	Burger2 burger2;
	final int COKE = 1000;
	final int POTATO = 1500;
	int hamprice;

	//인자생성자
	public HamburgerPrice2(Burger2 burger2) {
		burger2 = new Burger2();
	}

	//기본가격계산
	public int hamprice(int hamprice) {
		return hamprice = burger2.getPrice() + COKE + POTATO;
		
	}
	//햄버거와 결제금액 출력
	public void showPrice() {
		Burger2 burger2 = new Burger2();
		burger2.showHamInfo();
		System.out.println("결제금액 : "+ hamprice);
	}
	
	
}
//세트가격을 추상화(기본가격을 상속)
class SetPrice2 extends HamburgerPrice2 {
	final int DIS = -500;
	int settPrice;
	//인자생성자
	public SetPrice2(Burger2 burger2) {
		super(burger2);
	}

	//세트가격계산(오버라이딩)
	@Override
	public int hamprice(int settPrice) {
		return super.hamprice(hamprice) + DIS;
	}	
	
	//햄버거와 세트결제금액 출력(오버라이딩)	
	@Override
	public void showPrice() {
		Burger2 burger2 = new Burger2();
		burger2.showHamInfo();
		System.out.println("세트결제금액 : "+ settPrice);
		
	}
}

public class QuBuyHamburger02 {

	public static void main(String[] args) {
		
		//치즈버거 객체 생성
		Burger2 burger1 = new Burger2("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		//치킨버거 객체 생성
		Burger2 burger2 = new Burger2("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");
		
		//치즈버거를 기본가격으로 구매
		HamburgerPrice2 price1 = new HamburgerPrice2(burger1); 
		price1.showPrice();	// 4500원	
		System.out.println("===================");
		
		//치킨버거를 세트가격으로 구매
		HamburgerPrice2 price2 = new SetPrice2(burger2); 
		price2.showPrice();	// 5000원
		System.out.println("===================");
	}
}
