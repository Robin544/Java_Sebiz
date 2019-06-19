// To print the Fibbnocci series --->>

class Fibbnocci
{
	public static void main(String args[])
	{
		long a = 0, b = 1, c;
		for (long i = 0; i <= 10; i++)
		{
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
		}
	}
}