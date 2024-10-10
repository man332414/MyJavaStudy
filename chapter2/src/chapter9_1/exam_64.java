package chapter9_1;

public class exam_64 
{

	public static void main(String[] args) 
	{
		try 
		{
			Exception e = new Exception("고의 예외");
			throw e;
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
