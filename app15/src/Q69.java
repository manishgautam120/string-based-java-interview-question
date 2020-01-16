/*
69. Combine two arrays and develop a third array. 
Consider element by element while combining and take forward direction from first array and reverse direction from 2nd array
*/

class Q69
{
	public static void main(String[] args) 
	{
		int[] x = {5, 2, 5, 4, 4, 4, 10, 3, 10, 5};
		         //0  1  2  3  4  5  6   7  8   9
		int[] y = {8, 0, 3, 1, 6};
		         //0  1  2  3  4  
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
		int length = x.length + y.length;
		int[] z = new int[length];
		for(int i = 0, j = 0, k = y.length - 1; i < z.length;)
		{
			if(j < x.length)
			{
				z[i ++] = x[j ++];
			}
			if(k >= 0)
			{
				z[i ++] = y[k --];
			}
		}
		System.out.println("z array content");
		for(int i = 0; i < z.length; i++)
		{
			System.out.print(z[i] + ", ");
		}
		System.out.println();

	}
}
