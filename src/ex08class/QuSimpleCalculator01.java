package ex08class;


/*
사칙연산을 할때마다
1. 연산의 결과
2. 몇번 수행되었는지
3. 출력.

메인함수에 부합하는 계산기 Ex클래스 정의(메인함수 수치 건드려도 됨)

init() 멤버메서드에서는 계산의 결과를 카운트하는 멤버 변수를 0으로 초기화한다.
 */

class CalculatorEx {
	double a;
	double b;
	int[] cnt = new int[4];
	
	
	void init() {
		for(int i = 0; i < 4 ; i++) {
			cnt[i] = 0;
		}
		System.out.println("계산 횟수를 초기화 합니다.");
	}
	
	double add(double a, double b) {
		cnt[0] ++;
		return a + b;
	}
	
	double min(double a, double b) {
		cnt[1] ++;
		return a - b;
	}
	double mul(double a, double b) {
		cnt[2] ++;
		return a * b;
	}
	double div(double a, double b) {
		cnt[3] ++;
		return a / b;
	}
	
	void showOpCount() {
		System.out.println("덧셈횟수 : "+ cnt[0]);
		System.out.println("뺄셈횟수 : "+ cnt[1]);
		System.out.println("곱셈횟수 : "+ cnt[2]);
		System.out.println("나눗셈횟수 : "+ cnt[3]);
	}
	
	
	
}

public class QuSimpleCalculator {

	public static void main(String[] args) {
		
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}
	
}


/*
출력 결과
1 + 2 = 3.0
10.5 - 5.5 = 5.0
4.0 * 5.0 = 20.0
100 / 25 = 4.0
10.0 * 3.0 = 30.0
덧셈횟수 : 1
뺄셈횟수 : 1
곱셈횟수 : 2
나눗셈횟수 : 1

*/