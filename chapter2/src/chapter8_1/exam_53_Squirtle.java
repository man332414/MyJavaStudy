package chapter8_1;

public class exam_53_Squirtle extends exam_53_Pokemon
{
	exam_53_Squirtle()
	{
		super();
		this.name = "꼬부기";
	}

	@Override
	void attack() 
	{
		System.out.println("물대포");
	}

	@Override
	void sound() 
	{
		System.out.println("꼬북 꼬북");
	}
	
	
}
