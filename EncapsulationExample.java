class Person {

    private double id;
    private String name;

    public Person() 
    {
        // Only Person class can access and assign
        id = Math.random();
        sayHello();
    }

    // This method is protected for giving access within Person class only
    private void sayHello() 
    {
        System.out.println("Hello - " + getId());
    }

    public double getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

}
public class EncapsulationExample 
{
	
	public static void main(String args[])
	{
	     Person p12 = new Person();
         p12.setName("Ramesh");
	
  
   

    System.out.println("Person 1 - " + p12.getId() + " : " + p12.getName());

}

}
