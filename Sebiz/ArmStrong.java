// To find the number is an Armstrong number or not.

import java.util.*;
import java.lang.Math;
class ArmStrong
{
	public static void main(String[] args)
	{
		int rem, ans = 0, i, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any positive number: ");
		int num = sc.nextInt();
		
		temp = num;
		while (num > 0)
		{
			rem = num % 10;
			num /= 10;
			ans += (rem * rem * rem);
		}
		if (temp == ans)
			System.out.println(temp + " is an Armstrong number.");
		else
			System.out.println(temp + " isn't an Armstrong number.");
	}
}