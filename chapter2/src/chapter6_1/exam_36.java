package chapter6_1;

public class exam_36 
{
	public static void main(String[] args)
	{
		Area.manual();
		
		Area cal = new Area();
		cal.manual();
		System.out.println(cal.triangle(3, 5));
		System.out.println(cal.rectangle(3, 4));
	}
}
