package chapter3_1;

public class exam_7 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 1;
		System.out.println("현재 a 는 " + a);
		
		--a; a++;
		System.out.println("전 행에서 증가 후 a는 " + a);
		System.out.println("전위 연산자를 사용한 a는 " + ++a);
		System.out.println("이번 행에서 후위 연산자를 사용한 a는 " + a++);
		System.out.println("전 행에서 후위 연산자를 사용한 a는 " + a);
	}
}