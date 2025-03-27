package ex99gptquiz;

public class E07GetValue {

	public static void main(String[] args) {
		
		System.out.println("배열의 길이를 입력하세요");
		int num = Scan.scan.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num ; i ++ ) {
			System.out.println("숫자를 입력하세요");
			arr[i] = Scan.scan.nextInt(); 
		}
		
		boolean su = false;
		
		System.out.println("찾고자 하는 숫자를 입력하세요");
		int s = Scan.scan.nextInt();
		for(int i = 0; i < num ; i++) {
			if (arr[i] == s) {
				su = true;
				break;
			}
		}
		
		if(su == true) {
			System.out.printf("%d(은)는 배열에 존재합니다.", s);
		}
		else {
			System.out.printf("%d는(은) 배열에 존재하지 않습니다.", s);
		}
		
		Scan.scan.close();
		
	}
	
	
}
