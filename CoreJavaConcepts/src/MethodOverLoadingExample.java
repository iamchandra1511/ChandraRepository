
public class MethodOverLoadingExample 
{
	
	public int abs(int a)  //Method with int as parameter
	{
		return a<0?a*-1:a;
	}
	
	public long abs(long a)  //Method with long as parameter
	{
		System.out.println("Long Version");
		return a<0?a*-1:a;
	}
	
	public float abs(float a)   //Method with float as parameter
	{
		System.out.println("Float Version");
		return a<0?a*-1:a;
	}
	
	public double abs(double a)   //Method with double as parameter
	{
		System.out.println("Double Version");
		return a<0?a*-1:a;
	}
	public static void main(String args[])
	{
		MethodOverLoadingExample  mo=new MethodOverLoadingExample ();
		System.out.println(mo.abs(-10));
		System.out.println(mo.abs(-10l));
		System.out.println(mo.abs(-10f));
		System.out.println(mo.abs(-10d));
	}

}
