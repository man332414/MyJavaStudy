package chapter7_1;

public class exam_52_ZooKeeper2 
{
	void feed(exam_52_Lion lion) 
	{
		System.out.println(lion+"에게 먹이를 줍니다.");
	}
	void feed(exam_52_Rabbit rabbit) 
	{
		System.out.println(rabbit+"에게 먹이를 줍니다.");
	}
	void feed(exam_52_Monkey monkey) 
	{
		System.out.println(monkey+"에게 먹이를 줍니다.");
	}
	void listen(exam_52_Lion lion)
	{
		lion.crySound();
	}
}
