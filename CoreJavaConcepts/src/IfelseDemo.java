
public class IfelseDemo 
{
	public static void main(String[] args) 
	{

        int testscore = 76; //integer variable initialized
        char grade;         //character variable 

        if (testscore >= 90)   //condition to check 
        {
            grade = 'A';      
        }
        else if (testscore >= 80) 
        {
            grade = 'B';
        }
        else if (testscore >= 70) 
        {
            grade = 'C';
        }
        else if (testscore >= 60) 
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }

}
