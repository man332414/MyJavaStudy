package chapter2_1;

public class method_test 
{

	public static void main(String[] args) 
	{
		calculator cl;
		cl = new calculator();
		
		int rt = cl.plus(10, 20);
		
		System.out.println(rt);
		
		int rt2 = cl.minus(1, 2, 3);
		System.out.println(rt2);
	}

}
