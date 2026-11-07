package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode_01 
{

	public static void main(String[] args)
	{
		int[] arr = twoSum(new int[] {1,2,5,7}, 9);
		System.out.println("Value : " + Arrays.toString(arr));
	}
	
	public static int[] twoSum(int[] nums, int target) 
	{
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++)
		{
			int compliment = target - nums[i];
			
			if(map.containsKey(compliment)) {
				return new int[] {map.get(compliment), i};
			}
			else
			{
				map.put(nums[i], i);
			}
		}
		return new int[] {};
		
	}

}
