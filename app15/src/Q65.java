/*
65. Find out the elements which are not duplicates 
	in the given array
*/

class Q65
{
	public static void main(String[] args) 
	{
		int[] x = {5, 2, 5, 4, 4, 4, 10, 3, 10, 5, 6, 1, 6};
		         //0  1  2  3  4  5  6   7  8   9
		System.out.println("x array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		for(int i = 0; i < x.length; i++)
		{
			int count = 0;
			for(int j = 0; j < x.length; j++)
			{
				if(x[i] == x[j])
				{
					count ++;
				}
			}
			if(count < 2)
			{
				System.out.print(x[i] + ", ");
			}
		}
	}
}
