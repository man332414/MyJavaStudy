package chapter7_1;

public class child extends parents
{
	void method1()
	  { //재정의

	  }
	void method2()
	{
		this.method1();
		super.method1();
	}

	public static void main(String[] args) 
	{
		child aa = new child();
		System.out.println(b);
		System.out.println(aa.a);
		aa.printer();
	}

}