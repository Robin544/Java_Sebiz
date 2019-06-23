// Implementation of Wrapper Classes --->>

import java.util.*;
class WrapperClassExample
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter an integer number: ");
		int num = sc.nextInt();
		
		// Autoboxing --->>
		Integer i = num;
		System.out.println("Value after autoboxing: " + i);
		
		// Unboxing --->>
		int x = ++i;
		System.out.println("Value after unboxing: " + x);
		
		// valueOf() method --->>
		Integer i1 = Integer.valueOf("123");
		System.out.println(i1);
		
		// parseInt() method --->>
		int x1 = Integer.parseInt("01010");
		System.out.println(x1);
	}
}	