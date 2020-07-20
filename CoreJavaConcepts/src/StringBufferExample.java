
public class StringBufferExample
{
	
	public static void main(String args[])
	{  
		StringBuffer sb=new StringBuffer();     //stringbuffer object
		System.out.println(sb.capacity());//default 16  
		sb.append("Hello");  
		sb.append("Java");
		System.out.println(sb.capacity());//now 16  
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		sb.ensureCapacity(10);//now no change  
		System.out.println(sb.capacity());//now 34  
		sb.ensureCapacity(50);//now (34*2)+2  
		System.out.println(sb.capacity());//now 70  
		}  

}
