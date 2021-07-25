// This Java program for implementation of Bubble Sort
class BubbleSort
{
void bubbleSort(int arr[])
{
int n = arr.length;
for (int i = 0; i < n-1; i++)
for (int j = 0; j < n-i-1; j++)
if (arr[j] > arr[j+1])
{
// swap arr[j+1] and arr[j]
int temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
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
public static void main(String args[])
{
BubbleSort ob = new BubbleSort();
int arr[] = {1,2,3,4,5};
ob.bubbleSort(arr);
System.out.println("Sorted array");
ob.printArray(arr);
}
}



//Selection sort
// Java program for implementation of Selection Sort
class SelectionSort
{
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
public static void main(String args[])
{
SelectionSort ob = new SelectionSort();
int arr[] = {10,23,3,7,12,9,100};
ob.sort(arr);
System.out.println("Sorted array");
ob.printArray(arr);
}
}
