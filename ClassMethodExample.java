
//import packages
import java.util.Date;

public class ClassMethodExample
{
	//declaring properties with different data types
	private double length,breadth,height;
	
	private String name;
	private int age;
	private Date date;
	private char c;
;	
	public void setLength(double l)
	{
	    //local variable
		
		length=l;
	}
	
	public void setBreadth(double b)
	{
		//assign the value to propety inside method
		breadth=b;
	}
	
	public void setHeight(double h)
	{
		height=h;
	}
	
	public double volume()
	{
		return length*breadth*height;
	}
	
    public static void main(String args[])
    {
        //creating an object
    	ClassMethodExample b=new ClassMethodExample();
    	
    	//calling method with parama
    	b.setLength(10.0);
    	
    	//calliing mehtod
    	
    	//returning value from method
    	
    	//pringing value to console
    	System.out.println(b.volume());
    	
    	
    }


}
