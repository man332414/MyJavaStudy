package chapter6_1;

public class overloadingPractice 
{
	static int sum(int a, int b)
	{
		System.out.println("정수 인자가 둘일경우 호출");
		return a+b;
	}
	
	static int sum(int a, int b, int c)
	{
		System.out.println("정수 인자가 셋일경우 호출");
		return a+b+c;
	}
	
	static float sum(float a, float b, float c)
	{
		System.out.println("플로트 인자가 셋일경우 호출");
		return a+b+c;
	}
	

	static double sum(double a, double b, double c)
	{
		System.out.println("더블 인자가 셋일경우 호출");
		return a+b+c;
	}
}
