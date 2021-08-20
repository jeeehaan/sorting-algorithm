import java.util.Scanner;
import java.io.File;
// Java program for implementation of Selection Sort
class SelectionSort
{
	static int comparison = 0;
	void sort(int arr[])
	{
		int n = arr.length;
		
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			comparison++;
		}
	}

	// Prints the array
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	// Driver code to test above
	public static void main(String args[]) throws Exception
	{
        Scanner scanner = new Scanner(new File("seratus.txt"));
        int [] arr = new int [100];
        int i = 0;
        while(scanner.hasNextInt())
        {
            arr[i++] = scanner.nextInt();
        }

        long start = System.nanoTime();
		SelectionSort ob = new SelectionSort();
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
        long end = System.nanoTime();
        long elapsedTime = end - start;
		System.out.println("Jumlah Perbandingan Selection Sort :" +comparison);
        System.out.println("Waktu yang diperlukan Selection Sort :" + elapsedTime/1000000 + " milisecond");
	}
}
/* This code is contributed by Rajat Mishra*/
