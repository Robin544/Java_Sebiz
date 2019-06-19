package primenumber.;
public class PrimeNo
{
	public void primeNumber(int lowerlmt, int upperlmt)
	{
		int i, j, rem = 0;
		for (i = lowerlmt; i <= upperlmt; i++)
		{
			if (i == 2)
					System.out.print(i);
			for (j = 2; j <= i-1; j++)
			{
				rem = i % j;
				if (rem == 0)
					break;
			}
			if (rem != 0)
					System.out.print(" " + i);
		}
	}
}