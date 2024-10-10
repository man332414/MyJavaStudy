package exam;

public class exam6 
{

	public static void main(String[] args) 
	{
		int rnrneks = 0;
		for(int i = 2; i < 10; i++)
		{
			for(int j = 2; j < 10; j++)
			{
				rnrneks = i * j;
				System.out.printf("%d x %d = %d ", j, i, rnrneks);
			}
			System.out.println();
		}
	}

}
