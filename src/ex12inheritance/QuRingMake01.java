package ex12inheritance;

/*
다음 Point클래스를 이용하여 다음 문제를 해결하시오. 
해당 문제는 상속(Inheritance)을 통해 구현하는것이 아니라 
구성(Composition)관계를 이용하여 해결한다. Point 클래스를 
기반으로 원을 의미하는 Circle클래스를 정의하자. 그리고 Circle클래스를 
기반으로 Ring클래스를 정의하자.
 */

class Point {
   	int xDot, yDot;
   	public Point(int x, int y) {
         		xDot=x;
         		yDot=y;
   	}
   	public void showPointInfo() {
         		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}
//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle extends Point{	
	//멤버변수
	int radian;//반지름
	Point center;
	
	//블라블라
	public Circle(int x, int y, int radian, Point center) {
		super(x, y);
		this.radian = radian;
		this.center = center;
	}
	
	public void showCircleInfo() {
		System.out.printf("반지름 : %d%n"	, radian);
		showPointInfo();
	}
	
	
}
//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring {
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	
	public void showRingInfo() {
		innerCircle = ()
		
	}
}

public class QuRingMake {

	public static void main(String[] args) {
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}
