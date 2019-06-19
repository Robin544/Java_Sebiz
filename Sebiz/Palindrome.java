// Palindrome of a number and a string.
import java.util.*;
class Palindrome
{
	public static void main(String[] args)
	{
		Palindrome pal = new Palindrome();
		pal.PalNumber();
		pal.PalString();
	}
	
	void PalNumber()
	{
		int ans = 0, rem, temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any positive number to check palindrome: ");
		int x = sc.nextInt();
		temp = x;
		while (x > 0)
		{
			rem = x % 10;
			ans = (ans*10) + rem;
			x /= 10;
		}
		if (temp == ans)
			System.out.println("Number is palindrome.");
		else
			System.out.println("Number is not palindrome.");
	}			
	
	void PalString()
	{
		String str;
		int flag = 0;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter any string to check palindrome: ");
		str = sc1.next();
		char ch[] = str.toCharArray();
		char rev[] = new char[str.length()];
		int len = str.length();
		
		for (int i = len - 1; i >= 0; i--)
		{
			for(int j = 0; j <= len - 1; j++)
				rev[j] = ch[i];
		}
		
		for (int i = 0; i <= len - 1; i++)
		{
			for(int j = 0; j <= len - 1; j++)
			{
				if (rev[j] == ch[i])
					flag = 1;
				else
					flag = 0;
			}
		}
		
		if (flag == 1)
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}