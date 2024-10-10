package chapter4_1;

public class extra_exam_1_8 
{

	public static void main(String[] args) 
	{
		int month = (int)(Math.random()*12);
		
		if(month == 12 || month<=2)
		{
			System.out.println("겨울입니다.");
		}
		else if(month<=5)
		{
			System.out.println("봄입니다.");
		}
		else if(month<=9)
		{
			System.out.println("여름입니다.");
		}
		else
		{
			System.out.println("가을입니다.");
		}
		System.out.println(month);
	}

}
