// Linear and binary search
import java.util.*;
import java.lang.Math;
class Searching
{
	public static void main(String[] args)
	{
		int item, arr[], loc = 0, lb = 0, ub = 9, j, k, n, m;
		Scanner sc = new Scanner(System.in);
		arr = new int[10];
		int len = arr.length;
		System.out.print("Enter the 10 elements of an array: ");
		
		for(int i = 0; i < len; i++)
			arr[i] = sc.nextInt();
		
		System.out.print("Enter the element to be search: ");
		item = sc.nextInt();

		// Code for Linear Search --->>
		for (j = 0; j < len; j++)
		{
			if (arr[j] == item)
			{
				loc = j;
				System.out.println("In Linear search: " + item + " is found at " + loc + "th location.");
			}
		}
		if (loc == 0)
				System.out.println("In Linear search: " + item + " is not found!!");
			
			
		// Code for binary search --->>
		if (lb <= ub)
		{
			int mid = (ub + lb)/2;
			if (item < arr[mid])
			{
				lb = 0;
				ub = mid - 1;
				for (m = lb; m <= ub; m++)
				{
					if (arr[m] == item)
					{
						loc = m;
						System.out.println("In Binary search: " + item + " is found at " + loc + "th location.");
					}	
				}
			}
			if (item > arr[mid])
			{
				lb = mid + 1;
				ub = len - 1;
				for (k = lb; k <= ub; k++)
				{
					if (arr[k] == item)
					{
						loc = k;
						System.out.println("In Binary search: " + item + " is found at " + loc + "th location.");
					}	
				}
			}
			if (item == arr[mid])
			{
				lb = ub = mid;
				for (n = lb; n <= mid; n++)
				{
					loc = n;
					System.out.println("In Binary search: " + item + " is the middle the element and the location is " + loc + "th");
				}
			}
			if (loc == 0)
				System.out.println("In Binary search: Item  not found!!");
		}	
	}
}