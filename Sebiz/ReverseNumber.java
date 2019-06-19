// Take an input of a number and create a new number reverse of the entered one.
import java.util.*;
class ReverseNumber
{
	public static void main(String[] args)
	{
		int ans = 0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any positive number: ");
		int x = sc.nextInt();

		if (x == 0)
			System.out.println("You entered Zero");
		else
		{	
			while (x>0)
			{
				rem = x%10;
				ans = (ans*10) + rem;
				x /=10;
			}
			System.out.print("Reverse of the entered number is: " + ans);
		}
	}
}