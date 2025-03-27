package ex08class;

/*
1. 밑변, 높이의 정보를 저장할 수 있는 삼각형 클래스 정의
2. init메서드를 통해 밑변과 높이를 초기화
3. 밑변과 높이를 변경시킬수 있는 메서드
4. 삼각형의 넓이를 계산해서 반환하는 메서드
 */
public class QuTriangle {
	/
	
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : "+ t.getArea());
	}
	/*
	실행결과]
	삼각형의 넓이 : 85.0
	삼각형의 넓이 : 350.0
	 */
}
