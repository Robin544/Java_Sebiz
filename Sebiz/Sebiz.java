package SFS;
public class Sebiz
{
	public void showDetails(String  choice)
	{
		switch (choice)
		{
			case "1":
			{
				System.out.println("\n Instructor of Java is Abc.\n The training will start on Jun10, 2019.");
				break;
			}
			case "2":
			{
				System.out.println("\n Instructor of Android is Efg.\n The training will start on Jun12, 2019.");
				break;
			}
			case "3":
			{
				System.out.println("\n Instructor of Python is Hij.\n The training will start on Jun14, 2019.");
				break;
			}
			case "40":
			{
				System.out.println("\n Instructor of PHP is Klm.\n The training will start on Jun17, 2019.");
				break;
			}
			case "5":
			{
				System.out.println("\n Instructor of Digital Marketing is Nop.\n The training will start on Jun19, 2019.");
				break;
			}				
		}
	}
}