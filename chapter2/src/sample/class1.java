package sample;

public class class1 
{
	void b(int x) 
	{
		c(x);
	}
	
	void c(int x) 
	{
		d(x);
	}
	
	void d(int x) 
	{
		System.out.println(x);
	}
	
	static void main(String[] args) 
	{
		class1 n1 = new class1();
		int x = 3;
		n1.b(x);
	}
}
