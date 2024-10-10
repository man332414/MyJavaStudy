package chapter9_1;

public class exam_65 
{
	static void methodA() throws Exception
	{
		System.out.println("A함수 도착");
		methodB();
	}
	static void methodB() throws Exception
	{
		System.out.println("B함수 도착");
		methodC();
	}
	static void methodC() throws Exception
	{
		System.out.println("C함수 도착");
		Exception e = new Exception();
		throw e;
	}
	
	public static void main(String[] args)
	{
		try 
		{
			methodA();
		}
		catch(Exception e)
		{
			System.out.println("메인에서 처리할거임");
		}
	}
}
