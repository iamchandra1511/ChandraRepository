
public class ThreadCreation implements Runnable
{
	public void run()   
	{
		
		MyMethod();
	}
	
	public synchronized void MyMethod()    //synchronized method
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(100);  //sleep method
			}
			catch(Exception ex)
			{
				
			}
		  }

	}
	public static void main(String args[])
	{
		ThreadCreation mt=new ThreadCreation();
		Thread t1=new Thread(mt);
		Thread t2=new Thread(mt);
		t1.start();  //start method
		t2.start();
	}

}
