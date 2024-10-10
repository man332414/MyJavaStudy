package chapter4_1;

public class extra_exam_1_9 
{

	public static void main(String[] args) 
	{
		char character = 'A';
		System.out.println((char)(character));
		System.out.println((int)(character));
		
		if(character >= 'A' && character <= 'Z')
		{
			System.out.println("대문자 입니다.");
		}
		else if(character>='a' && character <= 'z')
		{
			System.out.println("소문자 입니다.");
		}
		else
		{
			System.out.println("알파벳이 아닙니다.");
		}
	}

}
