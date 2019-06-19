// Method overloading --->>

class MethodOverloading
{
	public int x, y;
	void methodOverloading()
	{
		x = 0;
		x++;
		y = 1;
		y++;
		System.out.println("x = " + x + " y = " + y);
	}	
	
	void methodOverloading(int a)
	{
		++a;
		x = a;
		System.out.println("Volume of the cube = " + (x * x * x));
	}	
	void methodOverloading(int a, int b)
	{
		a++;
		x = a;
		b++;
		y = b;
		System.out.println("Area of rectangle = " + x * y);
	}	
	public static void main(String args[])
	{
		MethodOverloading mo = new MethodOverloading();
		mo.methodOverloading();
		mo.methodOverloading(2);
		mo.methodOverloading(8, 9);
	}
}