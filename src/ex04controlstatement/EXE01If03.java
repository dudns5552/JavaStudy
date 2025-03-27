package ex04controlstatement;

public class EXE01If03 {

	public static void main(String[] args) {

		/*
		시나리오* 국, 영, 수 점수의 평균값을 구하여 학점을 출력하는 프로그램을
		작성하시오. 90점 이상은 A학점... 60점 미만은 F학점을 출력하면 된다.
		 */
		int kor, eng, math;
		kor = 99;
		eng = 70;
		math = 64;
		
		double avg = (kor+eng+math) / 3.0;
		
		System.out.println("평균점수는 (그대로) : " + avg);
		System.out.printf("평균점수는 : %.2f\n ", avg);		
		
		if(avg >= 90) {
			System.out.println("A학점");
		}
		else if (avg >= 80) {
			System.out.println("B학점");
		}
		else if (avg >= 70) {
			System.out.println("C학점");
		}
		else if (avg >= 60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점");
		}
		
		System.out.println("잘못된 조건식의 if문");
		
	}

}
