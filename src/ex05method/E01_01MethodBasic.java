package ex05method;

import java.util.Scanner;

public class E01_01MethodBasic {

	//a와 b를 합하는 메소드
	public static int simpleFunc(int a, int b) {
		
		int sum = a + b;
		//a와 b를 합한 값을 반환
		return sum;
	}
	
	//이름을 입력하는 메소드
	public static void menuPrint() {
		
		System.out.println("당신의 이름은 무엇인가요?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		namePrint(name); //name의 값이 String n으로 참조
	}
	
	//이름을 출력하는 메소드
	public static void namePrint(String n) {
		
		System.out.println("제 이름은 " + n + "입니다.");
	}
	
	public static void main(String[] args) {
		
		int result = simpleFunc(1, 2);
		System.out.println("1과 2를 전달한 결과 : "+ result);
		System.out.println("10과 20을 전달한 결과 : "+ simpleFunc(10, 20));
		
		menuPrint();

	}

}
