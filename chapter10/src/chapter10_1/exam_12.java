package chapter10_1;

public class exam_12
{

	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();
		System.out.println("시작시간 : " + start);
		
		int a = 0;
		for(int i = 1; i< 10000000; i++)
		{
			a++;
		}
		System.out.println(a);
		long end = System.currentTimeMillis();
		System.out.println("종료시간 : " + end);
		System.out.println("소요시간 : " + (end-start) + "ms");
	}

}
