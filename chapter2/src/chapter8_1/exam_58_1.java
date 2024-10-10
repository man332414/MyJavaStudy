package chapter8_1;

public class exam_58_1 
{

	public static void main(String[] args) 
	{
		exam_58_1_OuterClass1 o = new exam_58_1_OuterClass1() 
		{
			void a() 
			{
				System.out.println("새롭게 정의한 익명 클래스의 메서드 입니다.");
			}
		};
		
		o.a();
		exam_58_1_OuterClass1 ok = new exam_58_1_OuterClass1();
		ok.a();
	}

}
