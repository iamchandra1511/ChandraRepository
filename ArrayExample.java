
public class ArrayExample 
{
	
    
	int[] age = {12, 4, 5, 2, 5};
	
	public void ShowArrayValues()
	{
		
		for (int i = 0; i < 5; ++i) 
		{
            System.out.println("Element at index " + i +": " + age[i]);
        }
	}
	
	public void ShowValuesWithForEach()
	{
		for (int value : age)
		{

			System.out.println(value);

		}
	}
	
	 public static void main(String[] args) 
	 {

            ArrayExample ae=new ArrayExample();
            ae.ShowArrayValues();
            ae.ShowValuesWithForEach();
	        
     }
}
