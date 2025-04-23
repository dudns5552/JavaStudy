package codingtest;

public class duo {
	public int solution(int n) {
        int answer = 0;
        if(n %2 == 0){
            for(int i = n ; i >= 0 ;){
                answer = answer + i*i;
                i -= 2;
            }
        }
        else{
            for(int j = n ; j >= 0 ;){
                answer += j;
                j -= 2;
            }
        }
        return answer;
    }
}
