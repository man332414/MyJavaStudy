package chapter6_1;

public class tester 
{
	
	public static void main(String[] args) 
	{
		for(int i = 2; i<=9; i++)
		{
			for(int j = 2; j<=9; j++)
			{
				System.out.printf("%d * %d = %d ", j, i, i*j);
			}
			System.out.println();
		}
	}

}
