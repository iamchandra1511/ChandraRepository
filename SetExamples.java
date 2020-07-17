import java.util.HashSet;
import java.util.Iterator;

public class SetExamples 
{
	
	HashSet set=new HashSet();   //hashset object
	java.util.TreeSet TreeSet = new java.util.TreeSet();  //treeset object
	
	public void HashsetWithIntegers()
	{
		set.add(10);                 //adding objects to hashset 
		set.add(20);
		set.add(20);
		set.add(10);
		set.add(30);
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());   //displaying values from hashset
		}
	}
	
	public void HashsetWithStrings()
	{
		 set.add("One");    
         set.add("Two");    
         set.add("Three");   
         set.add("Four");  
         set.add("Five");  
         Iterator<String> i=set.iterator();  
         while(i.hasNext())  
         {  
         System.out.println(i.next());  
         }  
	} 
	
	public void TreeSetWithStrings()
	{
		TreeSet.add("A");   //adding values to treeset
		TreeSet.add("B");
		TreeSet.add("C");
		TreeSet.add("D");
		TreeSet.add("E");
		Iterator<String> itr = TreeSet.iterator();
		 
		while(itr.hasNext()) 
		{
		    String value = itr.next();     //displaying values from treeset
		     
		    System.out.println("Value: " + value);
		}
	}
	
	public void ShowTreeSet()
	{
		
		TreeSet.add(30);
		TreeSet.add(10);
		TreeSet.add(20);
		TreeSet.add(40);		
		TreeSet.add(10);
		 Iterator i=TreeSet.iterator();
			
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
	}
	
	public static void main(String args[])
	{
		SetExamples se=new SetExamples();
		se.HashsetWithStrings();
		se.HashsetWithIntegers();
		se.ShowTreeSet();
	}

}
