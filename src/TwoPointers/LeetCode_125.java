package TwoPointers;

public class LeetCode_125 {
	public static void main(String[] args) {
		System.out.println(validPalindrome("AbcA"));
		
	}
	
	static boolean validPalindrome(String s){
		
		int left = 0;
		int right = s.length() -1;
		
		while(left < right) 
		{
			while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			
			System.out.println("value : " +left+" "+ s.charAt(left));
			System.out.println("value : " +right+" "+ s.charAt(right));
			
			if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				return false;
			}
			
			left++;
			right--;
			
			
		}
		return true;
		
	}

}


