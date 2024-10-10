package chapter4_1;

public class extra_exam_1_6 
{

	public static void main(String[] args) 
	{
		int speed = (int)(Math.random()*120);
		
		if(speed>100)
		{
			System.out.println("과속");
		}
		else if(speed>80)
		{
			System.out.println("적당합니다.");
		}
		else
		{
			System.out.println("느립니다.");
		}
		System.out.println(speed);
	}

}
