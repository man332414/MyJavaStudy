package test1;

public class test 
{
	static int func(int a)
	{
		if(a<2)
		{
			System.out.print(a);
		}
		else
		{
//			func(a/2);
			System.out.print(1%2);
			System.out.print(2%2);
			System.out.print(5%2);
			System.out.print(10%2);
			System.out.print(20%2);
		}
		return 0;
	}
	
	public static void main(String[] args) 
	{
		func(20);
	}
}
