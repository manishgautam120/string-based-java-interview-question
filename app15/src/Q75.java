//maximum profit
class Q75 
{
	public static void main(String[] args) 
	{
		int[] x = {5, 7, 
				   10, 8,
				   2, 10,
			       15, 20,
			       20, 29,
			       40, 37,
			       5, 6,
			       7, 9};
		int product = 1, maxProfit = x[1] - x[0]; 
		int buying = x[0], selling = x[1], maxProductId = 1;
		for(int i = 2; i < x.length - 1; i += 2)
		{
			product ++;
			if((x[i + 1] - x[i]) > maxProfit)
			{
				maxProfit = x[i + 1] - x[i];
				buying = x[i];
				selling = x[i + 1];
				maxProductId = product;
			}
		}
		System.out.println("max profit product id:" + maxProductId);
		System.out.println("max profit buying price:" + buying);
		System.out.println("max profit selling price:" + selling);
		System.out.println("max profit:" + maxProfit);
	}
}
