package chapter4_1;

public class extra_exam_1_2 
{

	public static void main(String[] args) 
	{
		int month = (int) (Math.random()*12);
		
		if(month == 12 || month == 1 || month == 2)
		{
			System.out.println("겨울");
		}
		else if(month>=3 &&month <= 5)
		{
			System.out.println("봄");
		}
		else
		{
			System.out.println("여름 또는 가을");
		}
		System.out.println(month);
	}

}