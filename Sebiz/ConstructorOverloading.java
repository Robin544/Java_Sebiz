// Constructor overloading --->>

class ConstructorOverloading
{
	public int x, y;
	ConstructorOverloading()
	{
		x = 0;
		x++;
		y = 1;
		y++;
		System.out.println("x = " + x + " y = " + y);
	}	
	
	ConstructorOverloading(int a)
	{
		++a;
		x = a;
		System.out.println("Volume of the cube = " + (x * x * x));
	}	
	ConstructorOverloading(int a, int b)
	{
		a++;
		x = a;
		b++;
		y = b;
		System.out.println("Area of rectangle = " + x * y);
	}	
	public static void main(String args[])
	{
		ConstructorOverloading co = new ConstructorOverloading();
		ConstructorOverloading co1 = new ConstructorOverloading(2);
		ConstructorOverloading co2 = new ConstructorOverloading(5, 6);
	}
}