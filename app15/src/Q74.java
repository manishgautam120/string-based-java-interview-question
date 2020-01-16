/*
74. Sorting int elements from an arrays? 
(selection sort)
*/

class Q74
{
	public static void main(String[] args) 
	{
		int[] x = {1, 2, 5, 4, 4, 4, 10, 3, 10, 5, 9, 7};
		         //0  1  2  3  4  5  6   7  8   9
		System.out.println("x array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
		for(int i = 0; i < x.length - 1; i++)
		{
			int index = i;
			for(int j = i + 1; j < x.length; j++)
			{
				if(x[j] < x[index])
				{
					index = j;
				}
			}
			int temp = x[i];
			x[i] = x[index];
			x[index] = temp;
		}
		System.out.println("final array content");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
	}
}


/*
		int[] x = {5, 2, 5, 4, 4, 4, 10, 3, 10, 5, 9, 7};
		         //0  1  2  3  4  5  6   7  8   9
		i = 0
		-----
			j = 0;
				   2, 5, 5, 4, 4, 4, 10, 3, 10, 5, 9, 7
			j = 1;
				   2, 5, 5, 4, 4, 4, 10, 3, 10, 5, 9, 7
			j = 2;
				   2, 5, 4, 5, 4, 4, 10, 3, 10, 5, 9, 7
			j = 3;
				   2, 5, 4, 4, 5, 4, 10, 3, 10, 5, 9, 7
			j = 4;
				   2, 5, 4, 4, 4, 5, 10, 3, 10, 5, 9, 7
			j = 5;
				   2, 5, 4, 4, 4, 5, 10, 3, 10, 5, 9, 7
			j = 6;
				   2, 5, 4, 4, 4, 5, 3, 10, 10, 5, 9, 7
			j = 7;
				   2, 5, 4, 4, 4, 5, 3, 10, 10, 5, 9, 7
			j = 8;
				   2, 5, 4, 4, 4, 5, 3, 10, 5, 10, 9, 7
			j = 8;
				   2, 5, 4, 4, 4, 5, 3, 10, 5, 9, 10, 7
			j = 9;
				   2, 5, 4, 4, 4, 5, 3, 10, 5, 9, 7, 10
		i = 1;
			j = 0;
	  			   2, 5, 4, 4, 4, 5, 3, 10, 5, 9, 7, 10
			j = 1;
	  			   2, 4, 5, 4, 4, 5, 3, 10, 5, 9, 7, 10
			j = 2;
	  			   2, 4, 4, 5, 4, 5, 3, 10, 5, 9, 7, 10
			j = 3;
	  			   2, 4, 4, 4, 5, 5, 3, 10, 5, 9, 7, 10
			j = 3;
	  			   2, 4, 4, 4, 5, 5, 3, 10, 5, 9, 7, 10





*/
