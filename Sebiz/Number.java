// Program to check the mathematical properties of a number --->>

import java.util.*;

class Number
{
	void perfectAbundant(int number)
	{
		int sum = 0;
		// Loop to calculate the divisors of a number --->>
		for (int i = 1; i < number; i++)
		{
			if ((number % i) == 0)
			{
				sum += i;
			}
		}
		System.out.println(sum + " ");
		
		// Condition to check the perfect number --->>
		if(sum == number)
			System.out.println(number + " is a perfect number.");
		else
			System.out.println(number + " is not a perfect number.");
		
		// Condition to check the abundant number --->>
		if (sum > number)
			System.out.println(number + " is an abundant number.");
		else
			System.out.println(number + " is not an abundant number.");
	}
	
	// Code to check the strong number --->>
	void strongNumber(int n)
	{
		int sum = 0, temp, rem;
		temp = n;
		while(temp > 0)
		{
			rem = temp % 10;
			sum += factorial(rem);
			temp /= 10;
		}
		if (sum == n)
				System.out.println(n + " is a strong number.");
		else
			System.out.println(n + " is not a strong number.");
	}
	
	// Code to check the factorial of a number --->>
	int factorial (int n)
	{
		if (n == 0)
			return 1;
		else
			return(n * factorial(n - 1));
	}

	// Code to check the automorphic number --->>
	void automorphicNumber(int n)
	{
		int flag = 0;
		int sq = n * n;
		int temp = n;
		while (temp > 0)
		{
			if ((temp % 10) == (sq % 10))
				flag = 1;
			else
			{
				flag = 0;
				break;
			}
			temp /= 10;
			sq /= 10;
		}
		if (flag == 1)
			System.out.println(n + " is an automorphic number.");
		else
			System.out.println(n + " is not an automorphic number.");
	}
		
	public static void main(String[] args)
	{
		Number num = new Number();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number: ");
		int number = sc.nextInt();
		
		num.perfectAbundant(number);
		num.strongNumber(number);
		num.automorphicNumber(number);
		
		
		
	}
}