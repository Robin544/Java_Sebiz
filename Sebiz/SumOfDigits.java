// Take an input of a number and print sum of its digits.
import java.util.*;
class SumOfDigits
{
	public static void main(String[] args)
	{
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any integer number: ");
		int x = sc.nextInt();
		
		if (x == 0)
			System.out.print("Please entered Zero");
		
		while (x>0)
		{
			ans += (x%10);
			x/=10;
		}
		System.out.println("Sum of its digits: " + ans);
	}
}