package codingtest;

public class Overwirte {
	public static String solution(String my_string, String overwrite_string, int s) {
        char[] chr1 = my_string.toCharArray();
        char[] chr2 = overwrite_string.toCharArray();
        for(int n = s -2 ; n < chr2.length ; n++){
            chr1[n+2] = chr2[n];
            
        }
        StringBuffer answer2 = new StringBuffer();
        for(int i = 0 ; i < chr1.length ; i++) {
        	answer2.append(chr1[i]);
        }
       String answer = answer2.toString();
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("He11oWor1d", "lloWorl", 2)); 
	}
}
