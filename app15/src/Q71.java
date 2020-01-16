//71. Sorting int elements from an arrays? (use quick sort)
class Q71
{
	public static void main(String[] args)
	{
		int[] x = {10, 2, 25, 3, 15, 6, 18, 12, 20, 4, 1, 
						22, 14, 8, 24};
		System.out.println("Intial array content:");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
		System.out.println();
 		int min = 0;
		int max = x.length - 1;
 		quickSort(x, min, max);
		System.out.println("final array content:");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + ", ");
		}
	}
 
	public static void quickSort(int[] arr, 
								 int min, 
								 int max) 
	{
		if (arr == null || arr.length == 0)
		{
			return;
		} //1
 		if (min >= max)
		{
			return;
		} //2
 		// pick the pivot
		int middle = min + (max - min) / 2;
		int pivot = arr[middle];
// make left < pivot and right > pivot
		int i = min, j = max;
		while (i <= j)
		{
			while (arr[i] < pivot)
			{
				i++;
			} //3
			while (arr[j] > pivot)
			{
				j--;
			}//4
 			if (i <= j) 
 			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}//5
		}
		// recursively sort two sub parts
		if (min < j)
		{
			quickSort(arr, min, j);
		}//6
		if (max > i)
		{
			quickSort(arr, i, max);
		}//7
	}
}
