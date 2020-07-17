
abstract  class Shape 
{
	double dim1,dim2;
	
	public Shape(double d1,double d2)
	{
		dim1=d1;
		dim2=d2;
	}
	abstract public double Area();
	

}


public class AbstractClassExample extends Shape
{
	
	public AbstractClassExample(double d1,double d2)
	{
		super(d1,d2);
	}
	public double Area()   //overriding
	{
		return dim1*dim2;
	}
	public static void main(String args[])
	{
		AbstractClassExample r=new AbstractClassExample(10,20);
		System.out.println(r.Area());
	}

}
