// String to String Builder and vice versa --->>

import java.util.*;
class StringConversion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String: ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(str);		// Conversion from String to StringBuilder.
		sb.reverse();		// Reverse the given String.
		str = sb.toString();	// Conversion from StringBuilder to String.
		System.out.println("Reverse String is: " + str);
	}
}