package TwoPointers;

import java.util.Arrays;

public class LeetCode_167 {

	public static void main(String[] args) 
	{
		int[] arr = Sum(new int[]{2, 5, 6, 7, 10, 12, 21, 42}, 22);
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] Sum(int[] nums, int target) 
	{
		
		int left = 0;
		int right = nums.length -1;
		
		while(left < right) {
			int sum = nums[left] + nums[right];
			
			if(sum == target) {
				return new int[] {left, right};
			}
			else if(sum < target)
			{
				left++;
			}
			else
			{
				right--;
			}
			
		}
		
		return new int[]{};
	}

}
