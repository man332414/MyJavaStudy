package sample;

import java.util.Scanner;

public class class2 
{	
	public static void main(String[] args) 
	{
		//step 1. 재료 준비
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int firstNum = input.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int secondNum = input.nextInt();
		System.out.println("입력한 값을 어떻게 연산할 것인지 선택하세요.");
		System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈");
		int function = input.nextInt();

		//Step 3. 결과 출력
		switch(function) 
		{
		case 1:
			int plus = plus(firstNum, secondNum);
			System.out.println(plus);
			break;
		case 2:
			int minus = minus(firstNum, secondNum);
			System.out.println(minus);
			break;
		case 3:
			int mul = mul(firstNum, secondNum);
			System.out.println(mul);
			break;
		case 4:
			int div = div(firstNum, secondNum);
			System.out.println(div);
			break;
		default:
			System.out.println("입력한 숫자가 다릅니다.");
		}
	}
//Step 2. 재료가공
	static int mul(int a, int b) 
	{
//		System.out.println("곱셈 연결");
		int result;
		result = a*b;
		return result;
	}
	static int div(int a, int b)
	{
//		System.out.println("div");
		int result;
		result = a/b;
		return result;
	}
	static int plus(int a, int b)
	{
//		System.out.println("plus");
		int result;
		result = a+b;
		return result;
	}

	static int minus(int a, int b)
	{
//		System.out.println("minus");
		int result;
		result = a-b;
		return result;
	}	
}
