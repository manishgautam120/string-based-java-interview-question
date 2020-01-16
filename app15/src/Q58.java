/*
58. Find out missed elements from the given array 
	between min and max element
*/

class Q58
{
	public static void main(String[] args) 
	{
		int[] x = {5, 2, 8, 3, 20, 11, 7, 18, 10};
		         //0  1  2  3  4  5  6  7  8  9
		System.out.println("initial array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		int min = x[0], max = x[0];
		for(int i = 1; i < x.length; i++)
		{
			if(x[i] < min)
			{
				min = x[i];
			}
			if(x[i] > max)
			{
				max = x[i];
			}
		}
		boolean isAvaialble = false;
		for(int i = min + 1; i < max; i++)
		{
			for(int j = 0; j < x.length; j++)
			{
				if(i == x[j])
				{
					isAvaialble = true;
					break;
				}
			}
			if(!isAvaialble)
			{
				System.out.print(i + ", ");
			}
			isAvaialble = false;
		}
	}
}
