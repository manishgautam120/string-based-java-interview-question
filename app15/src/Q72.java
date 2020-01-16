//MergeSort
class Q72
{
	private static int[] array;
	private static int[] temp;
	public static void main(String a[])
	{

		int[] x = {4, 2, 1, 8, 7, 9, 5, 6, 0, 3};
		array = x;
		temp = new int[x.length];
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + " ");
		}
		System.out.println();
		sort(0, x.length - 1);
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
	private static void sort(int min, 
							int max)
	{
		if (min < max)
		{
			int middle = min + (max - min) / 2;
			// Below step sorts the left side of the array
			sort(min, middle);//1
			// Below step sorts the right side of the array
			sort(middle + 1, max);//2
			// Now merge both sides
			merge(min, middle, max);//3
		}
	}

	private static void merge(int min, 
				int middle, int max)
	{

		for (int i = min; 
				i <= max; i++)
		{
			temp[i] = array[i];
		}
		int i = min;
		int j = middle + 1;
		int k = min;
		while (i <= middle && j <= max)
		{
			if (temp[i] <= temp[j])
			{
				array[k] = temp[i];
				i++;
			}
			else
			{
				array[k] = temp[j];
				j++;
			}
			k++;
		}
		while (i <= middle)
		{
			array[k] = temp[i];
			k++;
			i++;
		}
	}
}
