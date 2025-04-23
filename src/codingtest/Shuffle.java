package codingtest;

public class Shuffle {

	public static String solution(String str1, String str2) {
        char[] strArr = new char[str1.length()*2 ];
        int a = 0;
        int b = 0;
        
        for(int i = 0 ; i < str1.length()+str2.length()  ; i++){
            if((i+1) % 2 ==0 ) {
            	strArr[i] = str2.charAt(b);
            	b++;
            }
            else {
            	strArr[i] = str1.charAt(a);
            	a++;
            }
        }
        String answer = strArr.toString().valueOf(strArr);
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("aaaaaa","bbbbbb"));
	}
}
