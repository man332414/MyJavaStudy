package chapter4_1;

public class extra_exam_1_1 
{

	public static void main(String[] args) 
	{
		int score = (int) (Math.random()*100);
		
		if(score>=90) 
		{
			System.out.println("A");
		}
		else if(score>=80) 
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("C");
		}
		System.out.println(((int)'a'));
	}
}
