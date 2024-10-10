package chapter9_1;

public class exam_67 
{
	public static void ticketing(int age) throws AgeException
	{
		if(age<0)
		{
			throw new AgeException("나이 입력이 잘못되었습니다.");
		}
	}

	public static void main(String[] args) 
	{
		int age = -19;
		try
		{
			ticketing(age);
		}
		catch(AgeException e)
		{
			System.out.println("나이 입력이 잘못되었씁니다.");
			e.printStackTrace();
		}
	}

}
