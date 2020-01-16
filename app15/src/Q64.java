/*
64. Find out index of an element which contains 
	left indexed element is same as right indexed element.
*/

class Q64
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
		for(int i = 1; i < x.length - 1; i++)
		{
			if(x[i - 1] == x[i + 1])
			{
				System.out.print(i + ", ");
			}
		}
	}
}
