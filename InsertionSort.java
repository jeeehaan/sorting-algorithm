import java.util.Scanner;
import java.io.File;
// Java program for implementation of Insertion Sort
class InsertionSort {
	/*Function to sort array using insertion sort*/
	static int comparison = 0;
	void sort(int arr[])
	{
		int n = arr.length;
		
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
				comparison++;
			}
			arr[j + 1] = key;
			
		}
	}

	/* A utility function to print array of size n*/
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver method
	public static void main(String args[]) throws Exception
	{
		Scanner scanner = new Scanner(new File("limaribu.txt"));
        int [] arr = new int [5000];
        int i = 0;
        while(scanner.hasNextInt())
        {
            arr[i++] = scanner.nextInt();
        }

        long start = System.nanoTime();
		InsertionSort ob = new InsertionSort();
		ob.sort(arr);

		printArray(arr);
        long end = System.nanoTime();
        long elapsedTime = end - start;
		System.out.println("Jumlah Perbandingan Insertion Sort :" +comparison);
        System.out.println("Waktu yang diperlukan Insertion Sort :" + elapsedTime/1000000 + " milisecond");
	}
} /* This code is contributed by Rajat Mishra. */
