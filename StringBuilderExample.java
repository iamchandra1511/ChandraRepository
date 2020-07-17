
public class StringBuilderExample 
{

	public static void main(String[] args) 
	{
		
		StringBuilder sbObj=new StringBuilder();  //stringbuilder object  
		System.out.println(sbObj.capacity());//default 16 
		
		sbObj.append("Java StringBuilder Class!");  
		System.out.println(sbObj.capacity());// capacity 34	

		sbObj.ensureCapacity(12);// no change  
		System.out.println(sbObj.capacity());//still 34  

		sbObj.ensureCapacity(60); // (34*2)+2 = 70 
		System.out.println(sbObj.capacity()); //70 

	}

}