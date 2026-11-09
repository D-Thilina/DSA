package SlidingWindow;

public class LeetCode_567 {

	public static void main(String[] args) {
		boolean result = permutation("aab", "aaaa");
		
		System.out.print(result);
		
	}
	
	public static boolean permutation(String s1, String s2) 
	{
		if(s1.length() > s2.length())
		{
			return false;
		}
		
		int[] s1Map = new int[26];
		int[] s2Map = new int[26];
		
		for(int i = 0; i < s1.length(); i++) {
			s1Map[s1.charAt(i) - 'a']++;
			s2Map[s2.charAt(i) - 'a']++;
		}

		for(int i = s1.length(); i < s2.length(); i++) {
			
			if(matches(s1Map, s2Map)) {
				return true;
			}

			s2Map[s2.charAt(i) - 'a']++; //Add new value
			s2Map[s2.charAt(i - s1.length())- 'a']--;  //Remove old value

		}
		return matches(s1Map, s2Map);
	}
	
	public static boolean matches(int[] s1, int[] s2) {
		
		for(int i = 0; i < 26; i++) {
			if(s1[i] != s2[i]) {
				return false;
			}
		}
		return true;
	}

}
