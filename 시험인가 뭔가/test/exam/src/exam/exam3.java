package exam;

class sub
{
	int calculator (int a, int b)
	{
		int result = a + b;
		return result;
	}
}

public class exam3 {

	public static void main(String[] args) 
	{
		int first = 10;
		int second = 20;
		sub sb = new sub();
		int result = sb.calculator(first, second);
		System.out.println("출력결과는 : " + result +"입니다.");
	}

}
