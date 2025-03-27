package ex99gptquiz;

public class E06Control {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요.");
		int num = Scan.scan.nextInt();
		boolean sosu = false;
		
		for(int i = 2; i < num ; i++) {
			if(num % i == 0) {
			sosu = true;
			break;
			}
		}
		if(sosu == true) {
		System.out.printf("%d는 소수가 아닙니다.", num);
		}
		else if (sosu == false){
			System.out.printf("%d는 소수입니다.", num);
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
		Scan.scan.close();
	}
}
