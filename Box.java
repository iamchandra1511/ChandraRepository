
public class Box 
{
	
	private double length,breadth,height;
	
	public Box(double length,double breadth,double height)   //constructor
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	
	public Box()
	{
		length=10;
		breadth=20;
		height=30;
	}
	
	/*
	public void setLength(double x)
	{
		length=x;
	}
	
	public void setBreadth(double y)
	{
		breadth=y;
	}
	
	public void setHeight(double z)
	{
		height=z;
	}
	*/
	public double volume()
	{
		return length*breadth*height;
	}
	
	public static void main(String args[])
	{
		Box b=new Box(10.0,10.0,10.0);
		//b.setLength(10);
		//b.setBreadth(10);
		//b.setHeight(10);
	    System.out.println(b.volume());
	}
	
	

}
