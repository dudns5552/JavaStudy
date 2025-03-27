package ex04controlstatement;

public class ExE03While3 {

	public static void main(String[] args) {
		
		
//		int x = 1;
//		while(x <= 4) { x가 4 초과될때까지 반복
//			//행(x)이 고정된 상태에서 열을 4번 반복하기 위한 변수
//			int y = 1;
//			while(y <= 4) { y가 4초과될때까지 반복
//				//행과 열의 번호가 동일할때 1을 출력
//				if(x == y ) {
//					System.out.print("1 ");
//				}
//				else {
//					//나머지는 0을 출력
//					System.out.print("0 ");
//				}
//				y++;
//			}
//		System.out.println();
//		x++;
//		}
//		System.out.println();
		
		
		
//		int x = 1;//행
//		while(x <= 4) { x가 4를 초과될때 까지 반복
//			int y = 4;//열
//			while(y>=1) { y가 1미만이 될때까지 반복
//				if(x == y) {
//					System.out.print("1 ");
//				}
//				else {
//					System.out.print("0 ");
//				}
//				y--;
//			}
//			System.out.println();
//			x++;	
//		}
		
		int x = 4;//행
		while(x >= 1) { //x가 1 미만이 될때까지 반복
			int y = 1;//열
			while(y <= 4) { //y가 4 초과 될때까지 반복
				if(x == y) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
				y++;
			}
			System.out.println();
			x--;	
		}
		
	}
}
