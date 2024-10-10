package exam;

class A 
{
	void learn() 
	{
		System.out.println("배우기");
	}
	
	void say()
	{
		System.out.println("말하기");
	}
	A(){}
}

class B extends A
{
	void lead()
	{
		System.out.println("이끌기");
	}
	
	B(){super();}
}

public class exam_1 
{

	public static void main(String[] args) 
	{
		B student = new B();
		student.say();
	}

}
