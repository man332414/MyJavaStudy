package exam_6;

public class exam7 
{
	String hello()
	{
		
		return "Hello World!"; 
	}

	public static void main(String[] args) 
	{
		exam7 a = new exam7();
		System.out.println(a.hello());
		for(int i = 0 ; i<a.hello().length(); i++)
		{
//			System.out.print(a.hello().charAt(i));
			for(int j = i+1; j<a.hello().length();j++) 
			{
				System.out.print(a.hello().charAt(j));
			}
			System.out.println();
		}
	}

}
