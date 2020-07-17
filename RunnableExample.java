
public class RunnableExample implements Runnable   //Runnable is predefined interface
{
	
	private String data;

	
	public RunnableExample(final String anyData)
	{
		this.data = anyData;
	}
	@Override
	public void run()    
	{
		for (int i = 0; i < 5; i++) 
		{
            System.out.println("[" + Thread.currentThread().getName() + "] [data=" + 
            this.data + "] Message " + i);
             try
             {
                  Thread.sleep(200);
             }
             catch (final InterruptedException e) 
             {
                 e.printStackTrace();
             }
        }


	}

}
