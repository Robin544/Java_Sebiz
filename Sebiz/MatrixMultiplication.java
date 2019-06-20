import java.util.*;
class MatrixMultiplication
{
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		// Code to enter the rows & columns of first matrix --->>
		System.out.print("Enter the rows of first matrix: " );
		int row1 = sc.nextInt();
		System.out.print("Enter the columns of first matrix: " );
		int col1 = sc.nextInt();
		
		int arr1[][] = new int[row1][col1];

		// Code to enter the elements of first matrix --->>
		System.out.println("Enter the elements of first matrix: ");
		for (int i = 0; i < row1; i++)
		{
			for (int j = 0; j < col1; j++)
				arr1[i][j] = sc.nextInt();
		}
		
		// Code to print the entered first matrix --->>
		System.out.println("\nFirst matrix is: ");
		for (int i = 0; i < row1; i++)
		{
			for (int j = 0; j < col1; j++)
				System.out.print(arr1[i][j] + " ");
				System.out.println();
		}
		
		// Code to enter the rows & columns of second matrix --->>
		System.out.print("Enter the rows of second matrix: " );
		int row2 = sc.nextInt();
		System.out.print("Enter the columns of second matrix: " );
		int col2 = sc.nextInt();
		
		int arr2[][] = new int[row2][col2];

		// Code to enter the elements of second matrix --->>
		System.out.println("Enter the elements of second matrix: ");
		for (int i = 0; i < row2; i++)
		{
			for (int j = 0; j < col2; j++)
				arr2[i][j] = sc.nextInt();
		}
		
		// Code to print the entered second matrix --->>
		System.out.println("\nSecond matrix is: ");
		for (int i = 0; i < row2; i++)
		{
			for (int j = 0; j < col2; j++)
				System.out.print(arr2[i][j] + " ");
				System.out.println();
		}
		
		if (col1 == row2)
		{
			// Code to calculate the multiplication matrix --->>
			
			int mul[][] = new int[row1][col2];
			
			System.out.println("\nThe resultant(Multiplication) matrix is: ");
			for (int i = 0; i < row1; i++)
			{
				for (int j = 0; j < col2; j++)
				{
					mul[i][j] = 0;
					for (int k = 0; k < col1; k++)
					{
						mul[i][j] += arr1[i][k] * arr2[k][j];
						
					}
					System.out.print(mul[i][j] + " "); // Code to print the result.
				}
				System.out.println();
			}
		}
		else
			System.out.println("Multiplication can't possible!");
	}
}