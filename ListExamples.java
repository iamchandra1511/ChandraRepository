import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ListExamples 
{
	LinkedList list;   //List type of classess
	ArrayList al;
	Vector v;
	
	 
	 public void ListWithIntegersExample()
		{
			al=new ArrayList();    
			al.add(10);            //adding integers to arraylist      
			al.add(20);
			al.add("Java");
			al.add(12.44);
			al.add(10);
			Iterator i=al.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());   //displaying values from arraylist
			}
		}
	    
		public void ListWithStringsExample()
		{
			al=new ArrayList(); 
			al.add("Mango");       //adding string values to arraylist
			al.add("Apple");    
			al.add("Banana");    
			al.add("Grapes");    
			  
			  Iterator itr=al.iterator();  
			  while(itr.hasNext())
			  {  
			   System.out.println(itr.next());  
			  }  
		}
		
		public void ShowLinkedList()
		{
			list=new LinkedList();
			list.add(10);       //adding integers to linkedlist
			list.add(20);
			list.add("java");
			list.add(10.2);
			list.add(10);
			
	         Iterator i=list.iterator();
			
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		}
		public void CreateVector()
		{
			v=new Vector();
			v.add(10);       //adding integers to vectors
			v.add(20);
			v.add(30);
			v.add("java");  
			v.add(10.2f);
			
			
			Iterator i=v.iterator();
			
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		}
		public static void main(String args[])
		{
			ListExamples le=new ListExamples();
			le.ListWithIntegersExample();
			le.ListWithStringsExample();
			le.ShowLinkedList();
			le.CreateVector();

		}


}
