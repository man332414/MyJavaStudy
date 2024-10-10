package chapter3_1;

public class exam_10 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println(5<a & a<15);
		System.out.println((5<a && a<15) && a%2==0);
		
		 a = 4;
		System.out.println(5<a && a<15);
		System.out.println((5<a || a<15) || a%2==0);
		
		char v = 'F';
		System.out.println((char)(v+a));
//		System.out.println(typeOf(v-a));
		
	}

}
