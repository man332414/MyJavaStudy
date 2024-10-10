package exam;

class user_exception extends Exception
{
	user_exception()
	{
		super("예외 발생");
	}
}

public class exam_5_2 
{

   public static void main(String[] args) 
   {
	   user_exception u = new user_exception();	   
	   int a = 0; 
	   int b = 2; 
	   System . out . println(" 연산시작 "); 
	   try
	   {
		   int c = b/a;  
	   }
	   catch(Exception e)
	   {
		   u.printStackTrace();  
	   }
   } 

}
