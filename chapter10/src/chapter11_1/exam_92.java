package chapter11_1;

import java.util.*;

public class exam_92 
{

	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		Scanner sc = new Scanner(System.in);
		
		hm.put("apple", "사과");
		hm.put("paper", "종이");
		hm.put("flower", "꽃");
		String voca;
		int re = 1;
		while(re != 0)
		{
			System.out.println("알고싶은 단어를 입력하세요");
			voca = sc.nextLine();
			
			if(hm.containsKey(voca))
			{
				System.out.println(hm.get(voca));
			}
			else
			{
				System.out.println("해당 단어데 대한 뜻은 데이터베이스에 없습니다.");
			}
			System.out.println("프로그램을 또 실행하시렵니꺼 끌려면 0을 입력하세요");
			re = sc.nextInt();
		}
	}

}
