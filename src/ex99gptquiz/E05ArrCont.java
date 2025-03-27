package ex99gptquiz;

/*
숫자의 배열의 최대값과 최소값을 찾는것 이므로 코드가 복잡할 필요가 없었다.
 */
public class E05ArrCont {

	public static void main(String[] args) {

		int[] arr = {3, 7, 2, 9, 5};
		
		int max = 0;
		int min = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr.length - 1 - i ; j++)
			if(arr[j] < arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp ; 
			}
		}
		max = arr[0];
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr.length - 1 - i ; j++)
			if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp ; 
			}
		}
		min = arr[0];
		
		System.out.println("최댓값 = "+ max);
		System.out.println("최소값 = "+ min);
		
	}
}
