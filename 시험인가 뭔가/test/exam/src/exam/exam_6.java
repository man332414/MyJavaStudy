package exam;

public class exam_6 
{

	public static void main(String[] args) 
	{
		String tmp = "abcd9f";
		
		for(int i = 0; i<tmp.length(); i++) 
		{
			int tmptmp = tmp.charAt(i);
			if(tmptmp >= 48 && tmptmp <=57) 
			{
				System.out.println((char)tmptmp + "는 숫자입니다.");
			}
			else
			{
				System.out.println((char)tmptmp + "는 문자입니다.");
			}
		}
	}

}
