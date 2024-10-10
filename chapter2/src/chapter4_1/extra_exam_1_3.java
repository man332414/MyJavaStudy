package chapter4_1;

public class extra_exam_1_3 
{

	public static void main(String[] args) 
	{
		int age = (int) (Math.random()*23);
		
		if(age < 13) 
		{
			System.out.println("어린이");
		}
		else if(age<20)
		{
			System.out.println("청소년");
		}
		else
		{
			System.out.println("성인");
		}
		System.out.println(age);
	}

}
