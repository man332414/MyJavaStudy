package chapter2_1;

public class calculator 
{
	int plus(int a, int b)
	{// 1. 리턴 타입 지정, 2. 매개변수 지정(타입과 갯수), 3. 리턴
		int result = a+b;
		return result;
	}
	// 정수, 실수, 논리, 문자, 참조
	int minus(int a, int b, int c)
	{
		int result = a-(b+c);
		return result;
	}
	int multiple(int a, float b){
		int result = a*(int)b;
		return result;
	}
	//몫을 리턴
	float div_1(int a, int b)
	{
		return a/(float)b;
	}
	//나머지 리턴
	int div_2(int a, int b){
		return a%b;
	}
	
}
