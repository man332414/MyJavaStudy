package chapter10_1;

public class exam_5 
{

	public static void main(String[] args) 
	{
		// 일반변수가 아닌 참조변수의 경우 참조값이 변수에 있으므로
		// call by value의 비교연산자를 사용할 수 없다.
		// 이때 비교함수를 사용하여 문자를 비교할 수 있다.
		String a = "Java";
		String b = "Java?";
		System.out.println(a.equals(b));
		System.out.println(a.contentEquals(b));
	}

}
