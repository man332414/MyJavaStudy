package chapter8_1;

public class exam_53 
{

	public static void main(String[] args) 
	{
		exam_53_Pikachu pikachu1 = new exam_53_Pikachu();
		System.out.println("이 포켓몬은 : " + pikachu1.name);
		pikachu1.attack();
		pikachu1.sound();
		
		exam_53_Squirtle Squirtle1 = new exam_53_Squirtle();
		System.out.println("이 포켓몬은 : " + Squirtle1.name);
		Squirtle1.attack();
		Squirtle1.sound();
	}
}	