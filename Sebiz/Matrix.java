// Matrix elements manipulation --->>

import java.util.*;
class Matrix
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows of matrix: " );
		int row = sc.nextInt();
		System.out.print("Enter the columns of matrix: " );
		
		int col = sc.nextInt();
		int arr1[][] = new int[row][col];
		int arr2[][] = new int[row][col];
		int sum[][] = new int[row][col];
		int mul[][] = new int[row][col];
		
		// Code for first matrix --->>
		System.out.println("Enter the elements of first matrix: ");
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
				arr1[i][j] = sc.nextInt();
		}
		
		// Code for second matrix --->>
		System.out.println("Enter the elements of second matrix: ");
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
				arr2[i][j] = sc.nextInt();
		}
		
		// Code to print the entered first matrix --->>
		System.out.println("\nFirst matrix is: ");
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
				System.out.print(arr1[i][j] + " ");
				System.out.println();
		}
		
		// Code to print the entered second matrix --->>
		System.out.println("\nSecond matrix is: ");
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
				System.out.print(arr2[i][j] + " ");
				System.out.println();
		}
		
		// Code to calculate the sum of matrices --->>
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				sum[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print("\n" + arr1[i][j] + " + " + arr2[i][j] + " = " + sum[i][j] + "  ");
			}
			System.out.println();
		}
		
		// Code to print the sum of matrices --->>
		System.out.println("\nThe resultant(Sum) matrix is: ");
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
				System.out.print(sum[i][j] + "  ");
			System.out.println();
		}
		
		// Code to calculate the multiplication matrix --->>
		System.out.println("\nThe resultant(Multiplication) matrix is: ");
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				mul[i][j] = 0;
				for (int k = 0; k < col; k++)
				{
					mul[i][j] += arr1[i][k] * arr2[k][j];
					
				}
				System.out.print(mul[i][j] + " ");
			}
			System.out.println();
		}
	}
}