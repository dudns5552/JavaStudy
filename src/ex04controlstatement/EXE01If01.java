package ex04controlstatement;

import java.io.IOException;

public class EXE01If01 {

	public static void main(String[] args)
	throws IOException{

		/*
		시나리오] 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을 
		if문을 이용해서 작성하시오.
		참조) System.in.read() : 키보드를 통해 입력한 문자의 
		아스키코드를 정수형으로 반환하는 메서드. 두글자 이상 입력하더라도 
		첫번째 문자만 입력된다.  
		 */

		System.out.println("숫자나 문자를 입력하세요.");
		int asciiCode = System.in.read();
		System.out.println("입력한 문자는 "+ asciiCode);
		
		if(asciiCode >= 48 && asciiCode <= 57) {
		System.out.println("입력한 문자는 숫자입니다.");
		}
		if(asciiCode >=65  && asciiCode <= 90) {
			System.out.println("입력한 문자는 대문자입니다.");
		}
		if(asciiCode >= 97 && asciiCode <= 122) {
			System.out.println("입력한 문자는 소문자입니다.");
		}
		else {
			System.out.println("잘못된 문자입니다.");
		}
		
		
		
		
		
	}

}
