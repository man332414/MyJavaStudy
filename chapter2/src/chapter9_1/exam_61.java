package chapter9_1;

public class exam_61 
{

	public static void main(String[] args) 
	{
		try 
		{
			int[] a = {2, 0};
			int b = 4;
			int c = b/a[2];
			System.out.println(c);
		}
		catch(Exception e) 
		{
			System.out.println("예외발생");
		}
		System.out.println("예외처리를 공부 중입니다.");
	}

}
