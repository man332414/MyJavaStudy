package chapter12_1;

class MyThread3 implements Runnable
{

	@Override
	public void run() 
	{
		for(int i = 0; i<10; i++)
		{
			System.out.println("t1 : " + i);
		}
		System.out.println("<<<t1 완료>>>");
	}
	
}

class MyThread4 implements Runnable
{

	@Override
	public void run() 
	{
		for(int i = 0; i<10; i++)
		{
			System.out.println("t2 : " + i);
		}
		System.out.println("<<<t2 완료>>>");
	}
	
}


public class exam_97 
{

	public static void main(String[] args) 
	{
		MyThread3 s1 = new MyThread3();
		MyThread4 s2 = new MyThread4();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		t1.start();
		try {
			t1.join();
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.toString());
		}
		t2.start();
		try {
			t2.join();
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.toString());
		}
		
		for(int i = 0; i<10; i++)
		{
			System.out.println("메인 스레드 : " + i);
		}
	}

}
