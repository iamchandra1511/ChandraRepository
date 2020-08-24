import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;



class Employee1 implements Comparable<Employee1> 
{
 
	int rollno;  
	String name;  
	int age;  
   
    
	public Employee1(int rollno,String name,int age)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  

	public int compareTo(Employee1 st)
	{  
		if(age==st.age)  
		return 0;  
		else if(age>st.age)  
		return 1;  
		else  
		return -1;  
		}  
}

public class ComparableExample 
{
	
	
	public static void main(String args[])
	{
	ArrayList<Employee1> al=new ArrayList<Employee1>();  
	al.add(new Employee1(101,"Vijay",23));  
	al.add(new Employee1(106,"Ajay",27));  
	al.add(new Employee1(105,"Jai",21));  
	  
	Collections.sort(al);  
	for(Employee1 st:al)
	{  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}
	}  
	}  
	
	

