package exam;

public class exam5 
{

	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i = 1; i<=100; i++)
		{
			if(i%3==0)
			{
				sum += i;
//				System.out.println(i);
			}
		}
		System.out.println("3의 배수 총합은 : " + sum);
	}

}
