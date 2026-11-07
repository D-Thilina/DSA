package Array;

import java.util.HashSet;

public class LeetCode_217_II {

	public static void main(String[] args) {
		boolean result = duplicate(new int[] {1, 3, 5});
		System.out.println(result);
		
	}
	
	public static boolean duplicate(int[] nums) 
	{
		if(nums.length == 0)
		{
			return false;
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i])) return true;
			
			set.add(nums[i]);
			
		}
		
		return false;
	}

}
