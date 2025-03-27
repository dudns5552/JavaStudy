package ex99gptquiz;

public class E05_1ArrCont {

	public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};

        // 초기값을 배열의 첫 번째 요소로 설정
        int max = arr[0];
        int min = arr[0];

        // 배열을 한 번 순회하며 최댓값과 최솟값 찾기
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("최댓값 = " + max);
        System.out.println("최솟값 = " + min);
    }
}
