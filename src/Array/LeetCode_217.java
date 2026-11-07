package Array;

import java.util.HashMap;
import java.util.Map;



public class LeetCode_217 {

	public static void main(String[] args) 
	{
		boolean res = duplicate(new int[] {1,2,5,7,12});
		System.out.println(res);
		
	}
	
	public static boolean duplicate(int[] arr)
	{
		
		Map<Integer, Integer> map = new HashMap<>(); 
		
		for(int i = 0; i < arr.length; i++)
		{
			if(map.containsKey(arr[i])) {
				return true;
			}
			
			map.put(arr[i], i);
		}
		
		return false;
	}

}
