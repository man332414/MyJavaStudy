package chapter7_1;

public class exam_52_Lion extends exam_52_Animal
{
	public String toString() 
	{
		return "사자";
	}

	@Override
	void crySound() 
	{
		System.out.println("어흥");
	}
	
}
