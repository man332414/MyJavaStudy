package chapter10_1;

import java.util.Calendar;
import java.util.GregorianCalendar;

class test
{
	int a;
	static test tmp = new test();
	public static test getIn()
	{
		return tmp;
	}
}

public class singleton 
{

	public static void main(String[] args) 
	{
		
//		System.out.println(a);
//		System.out.println(b);
		for(int i = 0; i<100; i++)
		{
			Calendar a = Calendar.getInstance();
			/*
			 public static Calendar getInstance()
			 {
			 	return (Calendar) ??;
			 } 
			 */
			Calendar b = new GregorianCalendar();
			System.out.println(a);
			System.out.println(b);
			if(i!=0&&i%10==0)
			{
				System.out.println(i);
			}
		}
	}

}
