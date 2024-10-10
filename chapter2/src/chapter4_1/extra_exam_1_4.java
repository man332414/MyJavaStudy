package chapter4_1;

public class extra_exam_1_4 
{

	public static void main(String[] args) 
	{
		int number = (int) (Math.random()*10);
		
		if(number % 2 == 0) 
		{
			System.out.println("짝수입니다.");
		}
		else if(number % 2 != 0) 
		{
			System.out.println("홀수입니다.");
		}
		else
		{
			System.out.println("잘못된 입력입니다.");
		}
		System.out.println(number);
	}

}
