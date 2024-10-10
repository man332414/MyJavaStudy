package exam;

import java.util.HashMap;
import java.util.Scanner;

public class exam_10 
{

	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		Scanner sc = new Scanner(System.in);
		
		hm.put("apple", "사과");
		hm.put("paper", "종이");
		hm.put("flower", "꽃");
		
		String voca;
		System.out.print("알고싶은 단어를 입력하세요 : ");
		
		voca = sc.nextLine();
		
		if(hm.containsKey(voca))
		{
			System.out.println("해당하는 뜻은 " + hm.get(voca) + "입니다.");
		}
		else
		{
			System.out.println("해당언어에 대한 뜻이 없습니다.");
		}
	}

}
