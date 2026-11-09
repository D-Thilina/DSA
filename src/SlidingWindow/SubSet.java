package SlidingWindow;

public class SubSet {

	public static void main(String[] args) 
	{
		int max = SubSetArr(new int[] {2, 1, 5, 1, 3, 2}, 3);
		System.out.println(max);
		
	}
	
	public static int SubSetArr(int[] arr, int k) 
	{
		int sum = 0;
		for(int i = 0; i < k; i++) {
			
			sum += arr[i];
		}
		
		int max = sum;
		
		for(int i = k; i < arr.length; i++) {
			sum += arr[i];
			sum -= arr[i - k];
			
			max = Math.max(max, sum);
		}
		
		return max;
	}

}
