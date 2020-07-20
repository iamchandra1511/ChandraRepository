class Employee 
{
 
 String name;
 int age;
 
 public String getName() 
 {
	 return name;
 }
 
 public void setName(String name) 
 {
	 this.name = name;
 }
 public int getAge() 
 {
	 return age;
 }
 public void setAge(int age) 
 {
	 if(age < 18)
	 
	 try 
	 {
		 throw new InvalidAgeException("Employee's age can not be less than 18");
	 }
	 catch (InvalidAgeException e) 
	 {
		 e.printStackTrace();
	 }
	 this.age = age;
 }
 
}


public class InvalidAgeException  extends Exception
{
	 
	 String message;
	 
	 InvalidAgeException(String message)
	 {
		  super(message);
		  this.message=message;
	 }
}
