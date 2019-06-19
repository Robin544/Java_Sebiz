// To print the prime numbers --->>
import primenumber.PrimeNo;
import java.util.*;
class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lower limit: ");
		int lowerlmt = sc.nextInt();
		System.out.print("Enter the upper limit: ");
		int upperlmt = sc.nextInt();
		
		PrimeNo pn = new PrimeNo();
		pn.primeNumber(lowerlmt, upperlmt);
	}
}