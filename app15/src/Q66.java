/*
66. Find out elements which are having minimum one duplicate?
*/

class Q66
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
			if(count >= 2)
			{
				System.out.print(x[i] + ", ");
			}
		}
	}
}
