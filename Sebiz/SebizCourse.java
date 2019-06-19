// Packages, instance block, static block --->>

import SFS.Sebiz;		// import SFS package from directory(D:\Local Disk (E)\Sebiz)
import java.util.*;
class SebizCourse
{
	// Instance block (Executes when object is created.)
	{
		System.out.print("\n Enter your choice between 1-5: ");
	}
	
	
	// Static block (Executes when the class is loaded.)
	static
	{
		System.out.println("\n Welcome to Sebiz Finishing School");
		System.out.println(" Enter the course you want to choose: \n\n 1. Java\n 2. Android\n 3. Python\n 4. PHP\n 5. Digital Marketing");
	}
	
	public static void main(String args[])
	{
		SebizCourse sebizcourse = new SebizCourse();
		Sebiz sebiz = new Sebiz();			// Making the object of Sebiz class defined in SFS package.
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sebiz.showDetails(str);
	}
}
		