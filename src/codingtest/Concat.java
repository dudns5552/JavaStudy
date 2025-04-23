package codingtest;

public class Concat {

	public static String solution(String[] arr) {
        String answer = "";
		for( int i = 0; i < arr.length ; i++) {
		answer = answer+arr[i];
		}
        return answer;
    }
	
	public static void main(String[] args) {
		String[] arr = {"a", "b", "c"};
			System.out.println(solution(arr));
	}
}
