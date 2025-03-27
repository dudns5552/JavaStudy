package ex12overriding;
class Burger3 {
    // 멤버변수
    String burN;
    private int price;
    String patty;
    String sauce;
    String veg;

    // 인자생성자
    public Burger3(String burN, int price, String patty, String sauce, String veg) {
        this.burN = burN;
        this.price = price;
        this.patty = patty;
        this.sauce = sauce;
        this.veg = veg;
    }

    // 가격 getter
    public int getPrice() {
        return price;
    }

    // 햄버거 정보 출력
    void showHamInfo() {
        System.out.println(burN);
        System.out.println("가격 : " + price);
        System.out.printf("식재료 : %s, %s, %s\n", patty, sauce, veg); // 🔹 수정: printf() 포맷 오류 수정
    }
}

// 햄버거의 기본가격 추상화
class HamburgerPrice3 {
    // 멤버변수
    Burger3 burger3; // 🔹 수정: 제대로 초기화되도록 변경
    final int COKE = 1000;
    final int POTATO = 1500;
    int hamprice;

    // 인자생성자
    public HamburgerPrice3(Burger3 burger3) {
        this.burger3 = burger3; // 🔹 수정: 전달받은 버거 객체를 저장
        this.hamprice = burger3.getPrice() + COKE + POTATO; // 🔹 수정: 가격을 즉시 계산
    }

    // 기본가격 반환
    public int hamprice() { 
        return hamprice; 
    }

    // 햄버거와 결제금액 출력
    public void showPrice() {
        burger3.showHamInfo(); // 🔹 수정: 올바른 객체 사용
        System.out.println("결제금액 : " + hamprice);
    }
}

// 세트가격을 추상화 (기본가격을 상속)
class SetPrice3 extends HamburgerPrice3 {
    final int DISCOUNT = 500; // 할인 금액

    // 인자생성자
    public SetPrice3(Burger3 burger3) {
        super(burger3);
        this.hamprice -= DISCOUNT; // 🔹 수정: 할인 적용
    }

    // 세트가격 계산 (오버라이딩)
    @Override
    public int hamprice() {
        return hamprice;
    }

    // 햄버거와 세트 결제금액 출력 (오버라이딩)
    @Override
    public void showPrice() {
        burger3.showHamInfo(); // 🔹 수정: 올바른 객체 사용
        System.out.println("세트결제금액 : " + hamprice);
    }
}

public class QuBuyHamburger03 {
    public static void main(String[] args) {
        // 치즈버거 객체 생성
        Burger3 burger1 = new Burger3("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
        // 치킨버거 객체 생성
        Burger3 burger2 = new Burger3("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");

        // 치즈버거를 기본가격으로 구매
        HamburgerPrice3 price1 = new HamburgerPrice3(burger1);
        price1.showPrice(); // 기대 결과: 4500원
        System.out.println("===================");

        // 치킨버거를 세트가격으로 구매
        HamburgerPrice3 price2 = new SetPrice3(burger2);
        price2.showPrice(); // 기대 결과: 5000원
        System.out.println("===================");
    }
}