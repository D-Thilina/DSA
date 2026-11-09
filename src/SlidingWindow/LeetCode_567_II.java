package SlidingWindow;

import java.util.HashMap;
import java.util.Map;


public class LeetCode_567_II {

	public static void main(String[] args) {
		boolean r = permutation("abb", "acdbba");
		System.out.println(r);
	}
	
	public static boolean permutation(String s1, String s2) {
		
		if(s1.length() > s2.length()) {
			return false;
		}
		
		Map<Character, Integer> map =  new HashMap<Character, Integer>();
		
		for(char c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		System.out.println(map);
		
		for(int i = 0; i < s1.length(); i++) 
		{
			if(map.containsKey(s2.charAt(i))) {
				map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0)-1);
			}
		}
		
		System.out.println(map);
		if(matches(map)) {
			return true;	
		}
		
		for(int i = s1.length(); i < s2.length(); i++) {
			
			
			if(map.containsKey(s2.charAt(i))) {
				map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) -1);
			}
			
			if(map.containsKey(s2.charAt(i - s1.length()))) {
				map.put(s2.charAt(i - s1.length()), map.getOrDefault(s2.charAt(i - s1.length()), 0) +1);
			}
			
			System.out.println(map);

		}
		
		return matches(map);
	}
	
	
	public static boolean matches(Map<Character, Integer> map){
		
		for(int value : map.values()){
			if(value != 0){
				return false;
			}
		}
		return true;
		
	}

}
