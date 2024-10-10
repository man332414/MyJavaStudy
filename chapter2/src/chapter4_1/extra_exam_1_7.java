package chapter4_1;

public class extra_exam_1_7 
{

	public static void main(String[] args) 
	{
		int score = (int)(Math.random()*100);
		
		if(score >= 90) 
		{
			System.out.println("A");
		}
		else if(score >= 80)
		{
			System.out.println("B");
		}
		else if(score >= 70)
		{
			System.out.println("C");
		}
		else if(score >= 60)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("F");
		}
		System.out.println(score);
	}

}
