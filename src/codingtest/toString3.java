package codingtest;

import java.lang.reflect.Array;

public class toString3 {
	
	public static int solution(String num_str) {
		
		int i = 0;
		int answer = 0;
		int[] a = new int[num_str.length()];
		int b = Integer.valueOf(num_str);
		while(b > 0) {
			
			a[i] = b % 10;
			b /= 10;
			++i;
		}
		
		for(int j = 0 ; j < a.length ; j++) {
			answer += a[j];
		}
		
		 
		
		
        return answer;
    }
	
public static void main(String[] args) {
		int n = 123;
	String str = String.valueOf(n);
	System.out.println(str);
	
	String a = "10";
	int answer = Integer.valueOf(a); 
	
	System.out.println(solution("123456789"));
}
}
