package chapter8_1;

public class exam_53_Pikachu extends exam_53_Pokemon
{
	exam_53_Pikachu()
	{
		super();
		this.name = "피카츄";
	}

	@Override
	void attack() 
	{
		System.out.println("전기 공격");
	}

	@Override
	void sound() 
	{
		System.out.println("피카 피카!");
	}
	
	
}
