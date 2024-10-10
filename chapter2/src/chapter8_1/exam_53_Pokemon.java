package chapter8_1;

public abstract class exam_53_Pokemon 
{
	String name;
	
	abstract void attack();
	abstract void sound();
	
	public String getName()
	{
		return this.name;
	}
	
	exam_53_Pokemon(){};
}
