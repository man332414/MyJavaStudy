package chapter12_1;

class MyThread extends Thread
{
	public void run() 
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("스레드 진행중 : " +i);
		}
	}
}

class MyThread2 implements Runnable
{

	@Override
	public void run() 
	{
		for(int i = 0; i<10; i++)
		{
			System.out.println("Runnable 진행중 : " + i);
		}
	}
	
}

public class exam_93 
{

	public static void main(String[] args) 
	{
		MyThread th1 = new MyThread();
		MyThread2 th2 = new MyThread2();
		Thread t = new Thread(th2);
		long start = System.currentTimeMillis();
		th1.run();
		t.run();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		start = System.currentTimeMillis();
		for(int i=0;i<10;i++)
		{
			System.out.println("메인 함수 진행 중 " + i);
		}
		end = System.currentTimeMillis();
		System.out.println(end-start);
	
	}

}
