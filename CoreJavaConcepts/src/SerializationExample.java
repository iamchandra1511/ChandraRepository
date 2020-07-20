import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable     //this class implemented Serializable interface
{
	
	String name;
	int id;
	
	public Student1(String name1,int id1)  //parameterized constructor
	{
		name=name1;
		id=id1;
	}
	
	public void Display()    //userdefined method
	{
		System.out.println("name is :"+name);
		System.out.println("Id is :"+id);
	}

}

public class SerializationExample 
{
	FileOutputStream fos;
	ObjectOutputStream oos;
	ObjectInputStream is;
	FileInputStream fis;
	File file;
	
	public void CreateStream()
	{
		try
		{
			Student1 s=new Student1("abc",1002);
			file=new File("d:\\MyFile.txt");
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			//byte b[]=data.getBytes();
			//fos.write(b);
			oos.writeObject(s);
			fis=new FileInputStream(file);
			is=new ObjectInputStream(fis);
			Student1 s1=(Student1)is.readObject();
			s1.Display();
		}
		catch(Exception e)
		{
			
		}
	}
	public static void main(String args[])
	{
		SerializationExample se=new SerializationExample();
		se.CreateStream();
	}

}
