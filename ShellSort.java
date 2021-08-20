import java.util.Scanner;
import java.io.File;
// Java implementation of ShellSort
class ShellSort
{
	static int comparison = 0;
	/* An utility function to print array of size n*/
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	/* function to sort arr using shellSort */
	int sort(int arr[])
	{
		int n = arr.length;

		// Start with a big gap, then reduce the gap
		for (int gap = n/2; gap > 0; gap /= 2)
		{
			// Do a gapped insertion sort for this gap size.
			// The first gap elements a[0..gap-1] are already
			// in gapped order keep adding one more element
			// until the entire array is gap sorted
			for (int i = gap; i < n; i += 1)
			{
				// add a[i] to the elements that have been gap
				// sorted save a[i] in temp and make a hole at
				// position i
				int temp = arr[i];

				// shift earlier gap-sorted elements up until
				// the correct location for a[i] is found
				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
					arr[j] = arr[j - gap];

				// put temp (the original a[i]) in its correct
				// location
				arr[j] = temp;
				comparison++;
			}
			
		}
		return 0;
	}

	// Driver method
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
		ShellSort ob = new ShellSort();
		ob.sort(arr);

		System.out.println("Array after sorting");
		printArray(arr);
        long end = System.nanoTime();
        long elapsedTime = end - start;
		System.out.println("Jumlah Perbandingan Shell Sort :" +comparison);
        System.out.println("Waktu yang diperlukan Shell Sort :" + elapsedTime/1000000 + " milisecond");
	}
}
/*This code is contributed by Rajat Mishra */

