package chapter6_1;

public class check 
{
	//instanceVariable : iv
	//classVariable : cv
	//instanceMethod : im
	//classMethod : cm
	
	static int cv = 5;
	int iv= 4;
	
	static void cm()
	{
		
	}

	void im()
	{
		
	}
	
	static void cm_Imember() // 생성되지 않은 변수 및 함수로부터 호출 
	{//스태틱은 인스턴스를 참조할 수 없음
//		System.out.println(iv);
//		im();
	}
	
	void im_Cmember() // new 이후 존재 → 이미 존재하고 있는 것을 사용
	{
		System.out.println(cv);
		cm();
	}
	
	static void cm_Cmember() 
	{
		System.out.println(cv);
		cm();
	}
	
	void im_Imember() 
	{
		System.out.println(iv);
		im();
	}
}
	