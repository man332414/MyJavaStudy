package chapter7_1;

public class exam_41_Leader extends exam_41_student 
{
	exam_40_teacher right = new exam_40_teacher();
//	right.right();
	void right()
	{
		System.out.println("자습시간에 떠들지마, 너 이름 적을거야");
	}

	@Override
	void say() 
	{
		System.out.println("선생님께 인사");
	}
	
}
