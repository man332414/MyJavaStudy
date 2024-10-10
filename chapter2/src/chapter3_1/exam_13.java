
package chapter3_1;

public class exam_13 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 3;
		int b = 5;
		
		b = a;
		System.out.println(b);
		
		a+=1;
		System.out.println(a);
		a/=1;
		System.out.println(a);
		a*=1;
		System.out.println(a);
		
		a= (++a)+(a++)+a+b;
		System.out.println(a);
		System.out.println(b);

	}

}
