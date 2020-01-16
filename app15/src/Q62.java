/*
62. Find out uncommon elements from two given arrays?
*/

class Q62
{
	public static void main(String[] args) 
	{
		int[] x = {5, 2, 8, 3, 20, 5, 11, 7, 18, 10, 3, 11, 11};
		         //0  1  2  3  4  5  6  7  8  9
		int[] y = {5, 8, 9, 3, 20, 7, 13};
		         //0  1  2  3   4  5   6  
		System.out.println("x array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		System.out.println("y array content");
		for(int i = 0; i < y.length; i++)
		{
			System.out.print(y[i] + ", ");
		}
		System.out.println();
		//print common elements
		int length = x.length + y.length;
		int[] z = new int[length];
		int count = 0;
		for(int i = 0; i < x.length; i++)
		{
			boolean uncommon = true;
			for(int j = 0; j < y.length; j++)
			{
				if(x[i] == y[j])
				{
					uncommon = false;
					break;
				}
			}
			if(uncommon)
			{
				boolean available = false;
				for(int k = 0; k < count; k++)
				{
					if(x[i] == z[k])
					{
						available = true;
						break;
					}
				}
				if(!available)
				{
					z[count ++] = x[i];
				}
			}
		}
		for(int i = 0; i < y.length; i++)
		{
			boolean uncommon = true;
			for(int j = 0; j < x.length; j++)
			{
				if(y[i] == x[j])
				{
					uncommon = false;
					break;
				}
			}
			if(uncommon)
			{
				boolean available = false;
				for(int k = 0; k < count; k++)
				{
					if(y[i] == z[k])
					{
						available = true;
						break;
					}
				}
				if(!available)
				{
					z[count ++] = y[i];
				}
			}
		}
		System.out.println("common elements");
		for(int i = 0; i < count; i++)
		{
			System.out.print(z[i] + ", ");
		}
	}
}
