

class Student12 
{
    private int rollNo;
    private String name;
    private static String college = "ABC"; // static variable
    
    public Student12(int rollNo, String name) //parameterized constructor
    {
        super();
        this.rollNo = rollNo;
        this.name = name;
    }
    @Override
    public String toString() 
    {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", college=" + college + "]";
    }
}

public class StaticVariableExample 
{
	
		public static void main(String[] args) 
		{
	        Student12 student = new Student12(100, "Student 1");
	        Student12 student2 = new Student12(101, "Student 2");
	        Student12 student3 = new Student12(102, "Student 3");
	        Student12 student4 = new Student12(103, "Student 4");

	        System.out.println(" ------------ Student 1 -------------");
	        System.out.println(student.toString());
	        System.out.println(student2.toString());
	        System.out.println(student3.toString());
	        System.out.println(student4.toString());
	}

}
