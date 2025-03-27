package ex16exception;

public class Ex00Comment {
	/*
	예외처리 (Exception Handling)
	
	Syntax에러
		실행자체가 되지 않는 코드
		문법에 오류가 있어 문법을 고쳐야 코드가 실행된다.
		
	Runtime에러
		컴파일시에는 체크가 안되고 실행시에만 발생되는 에러.
		예외는 Runtime에러에 속한다.
		
	외부자원을 사용할때 발생되는 예외
		처리방법1]
			"예외던지기"를 수행한다.
			main메서드에 throws IOException을 기술하면 해당
			메서드 내에서 발생되는 예외를 '무시'하겠다는 의미가된다.
		처리방법2]
			예외가 발생한 지점을 try~catch문으로 직접 감싸서 처리한다.
			
	
	try문으로 묶을때는 연관이 있는 코드끼리 같이 묶어주는게 좋다.
	
	Unreachable catch block
	실행되지 않는 블럭이다.
	
	Ex05Finally
	
	강제로 프로그램을 종료하고 싶을때 쓰는 코드
	System.exit(0)
	
	*/
}
