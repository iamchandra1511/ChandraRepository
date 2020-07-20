
public class StringExample 
{
	public static void main(String args[]) 
	{
        char c[] = {
            'J',
            'a',
            'v',
            'a'
        };
        
        String str = "Welcome to string handling programming";   //string object
        String s1 = new String(c);
        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("length of the string :: " + str.length());
    }

}
