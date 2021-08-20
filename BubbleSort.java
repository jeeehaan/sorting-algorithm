import java.util.Scanner;
import java.io.File;
// Java program for implementation of Bubble Sort
class BubbleSort
{ 
	static int comparison = 0;
	void bubbleSort(int arr[])
	{
		int n = arr.length;
		//perulangan selama indeks 0 dan indeks n-1
		for (int i = 0; i < n-1; i++){
		
			//perulangan untuk membandingkan indeks ke j dan indeks j+1
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					comparison++;	
				}
			
		}				
	}

	/* Prints the array */
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
			System.out.println();
	}

	// Driver method to test above
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
		BubbleSort ob = new BubbleSort();
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
        long end = System.nanoTime();
        long elapsedTime = end - start;
		System.out.println("Jumlah Perbandingan Bubble Sort :" +comparison);
        System.out.println("Waktu yang diperlukan Bubble Sort :" + elapsedTime/1000000 + " milisecond");
	}
}
/* This code is contributed by Rajat Mishra */

