package ex99gptquiz;

public class E08_1Palindrome {
	public static void main(String[] args) {

        System.out.print("단어를 입력하세요: ");
        String p = Scan.scan.nextLine();  // 사용자 입력 받기

        int left = 0;                // 왼쪽 인덱스
        int right = p.length() - 1;  // 오른쪽 인덱스

        // 회문 검사
        while (left < right) {
            if (p.charAt(left) != p.charAt(right)) {  // 서로 다른 문자가 있으면 회문이 아님
                System.out.printf("%s는 회문이 아닙니다.\n", p);
                Scan.scan.close();
                return;
            }
            left++;
            right--;
        }

        System.out.printf("%s는 회문입니다.\n", p);  // 회문일 경우
//        scan.close();  // Scanner 객체 닫기
    }
}
