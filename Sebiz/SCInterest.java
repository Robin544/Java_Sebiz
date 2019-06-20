// Calculate the simple interest and compound interest --->>

import java.util.*;
class SCInterest
{
	// Code to calculate the simple interest --->>
	void simpleInterest(double p, double r, double t)
	{
		double si = (p * r * t)/100;
		System.out.print("Simple Interest= Rs" + si );
	}
	
	// Code to calculate the compound interest --->>
	void compoundInterest(double p, double r, double t)
	{
		r = (1 + r / 100);
        for(int i = 0; i < t; i++)
          t *= r;
	  
		double totalAmount = p * t;
	 
		System.out.println("\nTotal amount= Rs"+ totalAmount);
	 
		double ci = totalAmount - p;
	 
		System.out.println("Compound Interest= Rs" + ci);
	}
	
	public static void main(String[] args)
	{
		SCInterest sc = new SCInterest();
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter the principle= Rs");
		double p = scanner.nextDouble();
		System.out.print("Enter the rate of interest(%)= ");
		double r = scanner.nextDouble();
		System.out.print("Enter the time period in months= ");
		double t = scanner.nextDouble();
		
		sc.simpleInterest(p, r, t);
		sc.compoundInterest(p, r, t);
		
	}
}