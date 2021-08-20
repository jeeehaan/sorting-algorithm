import java.util.Scanner;
import java.io.File;
// Java implementation of QuickSort
class QuickSort{

static int comparison = 0;
	
// A utility function to swap two elements
static void swap(int[] arr, int i, int j)
{
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}


/* function ini mengambil elemen terakhir sebagai pivot, 
meletakkan elemen yang lebih kecil di sebelah kiri pivot 
dan elemen yang lebih besar di sebelah kanan pivot*/

//low index pertama, high index terakhir
static int partition(int[] arr, int low, int high)
{
	
	// menentukan pivot, yaitu array dengan index terakhir
	int pivot = arr[high];

	//index elemen yang lebih kecil dan menandakan posisi pivot yang tepat sejauh ini
	int i = (low - 1);

	for(int j = low; j <= high - 1; j++)
	{
		
		// If current element is smaller
		// than the pivot
		if (arr[j] < pivot)
		{
			
			// Increment index of
			// smaller element
			i++;
			swap(arr, i, j);
			comparison++;	
		}
	
	}
	swap(arr, i + 1, high);
	return (i + 1);
}

/* The main function that implements QuickSort
		arr[] --> Array to be sorted,
		low --> Starting index,
		high --> Ending index
*/
static void quickSort(int[] arr, int low, int high)
{
	if (low < high)
	{
		
		// pi is partitioning index, arr[p]
		// is now at right place
		int pi = partition(arr, low, high);

		// Separately sort elements before
		// partition and after partition
		quickSort(arr, low, pi - 1);
		quickSort(arr, pi + 1, high);
	}
}

// Function to print an array
static void printArray(int[] arr, int size)
{
	for(int i = 0; i < size; i++)
		System.out.print(arr[i] + " ");
		
	System.out.println();
}

// Driver Code
public static void main(String[] args) throws Exception
{
	Scanner scanner = new Scanner(new File("limapuluhribu.txt"));
        int [] arr = new int [50000];
        int i = 0;
        while(scanner.hasNextInt())
        {
            arr[i++] = scanner.nextInt();
        }

    long start = System.nanoTime();
	quickSort(arr, 0, i - 1);
	System.out.println("Sorted array: ");
	printArray(arr, i);
    long end = System.nanoTime();
    long elapsedTime = end - start;
	System.out.println("Jumlah Perbandingan Quick Sort :" +comparison);
    System.out.println("Waktu yang diperlukan Quick Sort :" + elapsedTime/1000000 + " milisecond");
}
}

// This code is contributed by Ayush Choudhary
