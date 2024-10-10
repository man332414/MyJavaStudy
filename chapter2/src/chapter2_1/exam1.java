package chapter2_1;
// 파일의 이름은 exam1과 아래의 class exam1은 같아야 한다.
public class exam1
{
	public static void main(String[] args)
	{
		//변수
		//what : 데이터를 담는 상자
		//why : 재사용하기 위해서
		//how : 데이터타입 변수명 = 데이터
		byte a = 10;
		short b = 20;
		int c = 30;
		long d = 40L;
		int Tmp;
		
		System.out.println(a); // println() 함수에 변수 a에 대입되어 있는 10을 전달해라 
		System.out.println(10); // println() 함수에 10을 전달해라
		System.out.println('a');
		System.out.println("ab");
		
		//실수형 변수
		float e = 3.21f;
		double f = 3.99;
		System.out.println(e);
		System.out.println(f);
		
		// 문자형 변수
		char g = '가';
		System.out.println(g);
		
		// 논리형 변수
		boolean h = true;
		//boolean i = 1;
		System.out.println(h);
		
		//생성된 변수의 값을 변환하기
		a=20;
		
		/*
		 보라색 : 명령어
		 갈색/파란색 : 변수
		 "a" , 'a' : 문자  
		 10 : 숫자
		 a() : 함수
		   */
//		System.out.println(Tmp);
		
	}

}
