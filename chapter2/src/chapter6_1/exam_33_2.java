package chapter6_1;

class alpha
{
	static int aa;
}

class bravo
{
	int b;
}
public class exam_33_2 
{

	public static void main(String[] args) 
	{
		bravo v1 = new bravo(); 
		bravo v2 = new bravo();
		
		v1.b=10;
		v2.b=20;
		System.out.println(v1.b+ ", "+ v2.b);
		alpha.aa = 10;
		System.out.println(alpha.aa);
	}

}
