package ex04controlstatement;

public class QuPyramid5GPTCode {

	 public static void main(String[] args) {
	        int maxWidth = 5; // 가장 긴 줄에서 별(*)의 개수

	        // ★ 증가하는 패턴 생성 (위쪽 삼각형 부분)
	        for (int i = 0; i < maxWidth; i++) { // i는 행(row) 역할, 0부터 시작
	            for (int j = 0; j <= i; j++) { // j는 해당 행에서 출력할 '*' 개수
	                System.out.print("* "); // 별 출력
	            }
	            System.out.println(); // 한 줄 출력 후 줄 바꿈
	        }

	        // ★ 감소하는 패턴 생성 (아래쪽 삼각형 부분)
	        for (int i = maxWidth; i < 8; i++) { // i는 5부터 7까지 증가
	            for (int j = 0; j < 8 - i; j++) { // j는 현재 i 값에 따라 '*' 개수 감소
	                System.out.print("* "); // 별 출력
	            }
	            System.out.println(); // 한 줄 출력 후 줄 바꿈
	        }
	    }
	}

