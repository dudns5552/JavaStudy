package ex99gptquiz;

public class E08palindrome {//회문
	
	public static void main(String[] srgs) {
		
		System.out.println("단어를 입력하세요 : ");
		String p = Scan.scan.nextLine();
		
		int max = p.length() -1;
		boolean mun = false;
		for(int i = 0 ; i <= max ; i++, max-- ) {
			//codePointAt보단 charAt이 더 적절함
			if(p.codePointAt(i) == p.codePointAt(max)) {
				
				mun = true;
				if(i == max) {
					System.out.printf("%s는 회문입니다.", p);
				}
			}
			else {
				mun = false;
				break;
			}
		}
		if(mun == false) {
			System.out.printf("%s는 회문이 아닙니다.", p);
		}
		
		Scan.scan.close();
	}

}
