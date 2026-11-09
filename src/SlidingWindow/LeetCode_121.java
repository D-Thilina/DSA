package SlidingWindow;

public class LeetCode_121 {

	public static void main(String[] args)
	{
		int profit = maxProfit(new int[] {4, 3, 2, 1});
		System.out.println(profit);
		
	}
	
	public static int maxProfit(int[] prices) 
	{
		
		int min = prices[0];
		int profit = 0;
		
		for(int i = 0; i < prices.length; i++)
		{
			if(prices[i] < min ) {
				min = prices[i];
			}
			
			profit = Math.max(profit, prices[i] - min);
		}
		// TODO Auto-generated constructor stub
		return profit;
	}

}
