import java.util.*;
class Abc1
{
	int ans;
	void findSingleValue(int diff)		// Print single digit value
	{
		do
		{
			if ((diff/10) == 0)
				System.out.println("Ans is: " + ans);
			else
			{
				ans = diff;
				diff = 0;
				while (ans>0)
				{
					diff += (ans%10);
					ans = ans/10;
				}
				System.out.println("Ans is: " + diff);	
			}
		}
		while ((diff/10)!=0);
	}
}

// Main Activity class
class FirstProgram extends Abc1
{
	public static void main(String[] args)
	{
		FirstProgram ob = new FirstProgram();
		int arr[] = {1, 999, 2, 988, 3, 977, 4, 987, 5, 679};
		int sum1 = 0, sum2 = 0, diff;
		
		for(int i=0; i<10; i++)
		{
			if (i%2 == 0)
				sum1 += arr[i];		// Identify the even indeces
			else
				sum2 += arr[i];		// Identify the odd indeces
		}
		
		// Calculate the difference between even and odd indeces
		if (sum1 > sum2)
			diff = sum1 - sum2;
		else
			diff = sum2 - sum1;
		System.out.println(diff);
		
		// Print single digit answer
		if ((diff/10) == 0)
			System.out.println("Ans is: " + diff);
		else
			ob.findSingleValue(diff);
	}
}