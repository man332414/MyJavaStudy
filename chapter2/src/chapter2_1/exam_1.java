package chapter2_1;

public class exam_1 
{

	public static void main(String[] args) 
	{
		// promotion
		byte a = 10;
		short b = 256;
		int c = 30;
		long d = 40L;

		//test 1 : 같은 타입끼리 변환 : 큰것을 작은 것으로 넣는 것
		
		byte test_1 = (byte) b; //Type mismatch
		
//		System.out.println(test_1);
		
		//test 2 : 같은 타입끼리 변환 : 작은것을 큰것으로 넣는 것
		short test_2 = a;
//		System.out.println(test_2);
		
		//test 3 : 정수와 실수 사이의 형 변환
		int cc = 10;
		float dd = 3.14f;
		
		int test_3 = (int) dd;
//		System.out.println(test_3);
		
		//test 4 : 정수 -> 실수로 변환
		float test_4 = cc; //10 -> 10.0;
//		System.out.println(test_4);
		
		//test 5 : 정수 -> 문자
		int ccc = 10;
		char ddd = '宋';
		char eee = '根';
		char fff = '亨';
		String name = "宋根亨";
		//char test_5 = ccc;
		//test 6 : 문자 -> 정수
		//char은 원래부터 숫자와 문자의 양면성을 갖는다.
		int test_6 = ddd;
		int test_7 = eee; 
		int test_8 = fff;
		System.out.println(test_6);
		System.out.println(test_7);
		System.out.println(test_8);
		//test 7 : 실수 -> 문자
		//test 8 : 문자 -> 실수
	}

}
