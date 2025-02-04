package chapter10_1;

import java.util.Timer;
import java.util.TimerTask;

class Work1 extends TimerTask
{

	@Override
	public void run() 
	{
		System.out.println("work1");
	}
	
	public int result()
	{
		System.out.println("result 함수 실행");
		return 0;
	}
	
}

class Work2 extends TimerTask
{

	@Override
	public void run() 
	{
		System.out.println("work2");
	}
	
}

public class exam_78 
{

	public static void main(String[] args) 
	{
		Timer t = new Timer(true);
		TimerTask w1 = new Work1();
		TimerTask w2 = new Work2();
		t.schedule(w1, 3000);
		t.schedule(w2, 3000);
		try 
		{
			Thread.sleep(4000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("모든 작업 종료");
	}

}
