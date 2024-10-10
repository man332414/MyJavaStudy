package sample;

public class sample_exam 
{

	public static void main(String[] args) 
	{
		
		String test9 = "avcdx";
		System.out.println(test9 == "avcdx");
		System.out.println(test9.equals("avcdx")+"\n");
		//char 사용하기
		String test = "abcde9fg1230";
		
		String Cg = "";
		String num = "";
		for(int i = 0; i <test.length(); i++) 
		{
			char ch = test.charAt(i);			
			if((ch>=97 && ch<=122) || (ch>=65 && ch<=90))
			{
				Cg = Cg + ch;
//				System.out.println(ch + "영문자 입니다.");
			} else
			{
				num = num + ch;
//				System.out.println(ch + "영문자 아닙니다.");
			}
		}
		System.out.println(Cg);
		System.out.println();
		System.out.println(num);
//		
//		char test2 = 'A';
//		for(int i=0; i<10;i++)
//		{
//			int tmp = 0;
//			tmp = test2 + i;
//			System.out.println((char)tmp);
//		}
	}

}
