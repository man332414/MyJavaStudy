package object_test;

public class start 
{
	int a;
	static int b;
	public static void main(String[] args) 
	{
		System.out.println("시작합니다.");
		// 램 메모리 상에 설계도 member()를
		// 참고하여 객체(클래스)르 생성한다
		// 생성된 객체는 주소(new member)를 할당받는다.
		System.out.println(new member());
//		new member().age = 3;
		member mb = new member();
					/*
		 			램상에 클래스 구현
		 			주소부여
		 			주소 반환
					 */
		member mb2 = new member();
	}

}
