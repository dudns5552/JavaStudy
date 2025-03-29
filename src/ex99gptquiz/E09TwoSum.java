package ex99gptquiz;

import java.util.Random;
import java.util.Scanner;

/*
정수 배열 nums와 목표값 target이 주어졌을 때, 배열에서 두 수를 더하여 target이 
되는 두 숫자의 인덱스를 찾아 반환하는 함수 twoSum(int[] nums, int target)를 작성하시오. 각 입력에 대해 하나의 정답만 존재한다고 가정할 수 있다.
 */
public class E09TwoSum {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void twosum(int[] nums, int target) {
		
		/*
		2 <= nums.length <= 1000
		-10^5 <= nums[i] <= 10^5
		-10^5 <= target <= 10^5
		 */
		
		for (int i = 0; i < nums.length; i++) {
		    for (int j = i + 1; j < nums.length; j++) {
		        if (nums[i] + nums[j] == target) {
		            return new int[]{i, j}; // 정답 반환
		        }
		    }
		}
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		int[] a = {(rd.nextInt(1000))};
		twosum(a, 100);
	}
	
}
