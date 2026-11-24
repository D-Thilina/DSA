package TwoPointers;

import java.util.Arrays;

public class targetValue {

	public static void main(String[] args) 
	{
		int[] arr = sum(new int[]{1, 3, 5, 8, 2}, 10);
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] sum(int[] nums, int target)
	{	
		int left = 0;
		int right = nums.length -1;
		
		Arrays.sort(nums);
		while(left < right) {
			if(target == (nums[left] + nums[right])) {			
				return new int[] {left, right};
			}
			left++;
			
			if(target == (nums[left] + nums[right])) {
				return new int[] {left, right};
			}
			right--;
			
		}
		return new int[]{};
	}

}
