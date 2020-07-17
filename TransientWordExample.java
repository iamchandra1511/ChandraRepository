
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
 

class Country1 implements Serializable 
{  
  
 String name;  
 transient long population;  
   
 
 public Country1() 
 {
 super();
}
public Country1(String name, long population) 
{  
  super();  
  this.name = name;  
  this.population = population;  
 }  
 public String getName() 
 {  
  return name;  
 }  
 public void setName(String name) 
 {  
  this.name = name;  
 }  
 public long getPopulation() 
 {  
  return population;  
 }  
 public void setPopulation(long population) 
 {  
  this.population = population;  
 }
    
}  



public class TransientWordExample 
{
	Country1 india = new Country1();
	
	public void CreateStream()
	{
		 
		 india.setName("India");
		 india.setPopulation(100000);
		  try
		  {
		   FileOutputStream fileOut = new FileOutputStream("country.ser");
		   ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
		   outStream.writeObject(india);
		   outStream.close();
		   fileOut.close();
		  }catch(IOException i)
		  {
		   i.printStackTrace();
		  }
	}
	public static void main(String args[])
	{
		TransientWordExample te=new TransientWordExample();
		te.CreateStream();
	}

}
