class Personal  //super class is personal
{
	private String name,gender;  //string variables
	int age;     //integer variable
	
	public void setName(String name)   //setter method
	{
		this.name=name;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getName()   //getter method
	{
		return name;
	}
	public String getGender()
	{
		return gender;
	}
	public int getAge()
	{
		return age;
	}

}
public class InheritanceExample extends Personal    //child class is InheritanceExample
{
	private String university,standard;
	
	public void setUniversity(String university)
	{
		this.university=university;
	}
	public void setStandard(String standard)
	{
		this.standard=standard;
	}
	public String getUniversity()
	{
		return university;
	}
	public String getStandard()
	{
		return standard;
	}
    public static void main(String args[])
    {
    	InheritanceExample ac=new InheritanceExample();  //object 
    	ac.setUniversity("JNTU");
    	ac.setStandard("MS");
    	ac.setName("ABC");
    	ac.setAge(21);
    	ac.setGender("Male");
    	System.out.println(ac.getName());
    	System.out.println(ac.getGender());
    	System.out.println(ac.getAge());
    	System.out.println(ac.getUniversity());
    	System.out.println(ac.getStandard());
    }
}
