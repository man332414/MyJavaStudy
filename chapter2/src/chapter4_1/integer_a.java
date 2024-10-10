package chapter4_1;

public class integer_a 
{

	public static void main(String[] args) 
	{
		int age =  44;
		if(age>=0 && age<100)
		{
			if (age>=50) // 99~50대 입니다. 
			{
				System.out.println("50대 입니다.");
			}
			else if (age>=40) //49~40대 입니다.
			{
				System.out.println("40대 입니다.");
			}
			else if (age>=30) //39~30대 입니다.
			{
				System.out.println("30대 입니다.");
			}
			else if (age>=20) //29~20대 입니다.
			{
				System.out.println("20대 입니다.");
			}
			else if (age>=10) //19~10대 입니다.
			{
				System.out.println("10대 입니다.");
			}
			else if (age>=0) //10~0대 입니다.
			{
				System.out.println("유아 입니다.");
			}
			else
			{
				System.out.println("나이가 너무 많습니다.");
			}
		}
	}
}
