package chapter4_1;

public class extra_exam_1_5 
{

	public static void main(String[] args) 
	{
		int temperature = (int)(Math.random()*30);
		
		if(temperature>=27)
		{
			System.out.println("덥습니다.");
		}
		else if(temperature>=18)
		{
			System.out.println("적당합니다.");
		}
		else
		{
			System.out.println("춥습니다.");
		}
		System.out.println(temperature);
	}

}
