// Bubble sort --->>
import java.util.*;
class BubbleSort
{
	public static void main(String[] args)
	{
		BubbleSort bubble = new BubbleSort();
		Scanner sc = new Scanner(System.in);					
		int arr[] = new int[10];
		int len = arr.length;
		System.out.print("Enter the 10 elements of an array: ");
		
		for(int i = 0; i < len; i++)
			arr[i] = sc.nextInt();
		
		bubble.bubbleSort(arr);
	}
		
	// Swaping --->>
	void bubbleSort(int arr[])
	{
		int len = arr.length;
		for(int i = 0; i < len - 1; i++)
		{
			for(int j = 0; j < len - i - 1; j++)
			{
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.print("Sorted array is: ");
		for(int i = 0; i < len; i++)
			System.out.print(arr[i] + " ");
	}
}
	