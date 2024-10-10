package chapter10_1;

public class exam_6 
{

	public static void main(String[] args) 
	{
		String b = "안녕하세요 저는  입니다.";
//		String a = "kor, end, math";
//		String div[] = a.split(", ");
		String div2[] = b.split(" ");
		for(int i = 0; i<div2.length; i++)
		{
			System.out.println(div2[i]);
		}
	}

}
