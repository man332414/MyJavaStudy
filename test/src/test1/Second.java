package test1;

public class Second 
{
	int a;
	int b;
	
	int sum(int a, int b)
	{
		this.b = this.a + a;
		return this.b+b;
	}
	
	Second(){}
	Second(int a, int b){
		this.a = a;
		this.b = b;
	}
}
