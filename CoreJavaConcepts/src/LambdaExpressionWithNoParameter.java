interface Sayable{  
    public String say();  
}  
public class LambdaExpressionWithNoParameter 
{  
	public static void main(String[] args) 
	{  
	    Sayable s=()->{  
	        return "I have nothing to say.";  
	    };  
	    System.out.println(s.say());  
	}  
	}  
