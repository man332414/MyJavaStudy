package chapter10_1;

import java.util.Calendar;

public class exam_70 
{

	public static void main(String[] args) 
	{
		Calendar a = Calendar.getInstance();
		
		int year = a.get(Calendar.YEAR);
		int month = a.get(Calendar.MONTH) + 1;
		int date = a.get(Calendar.DATE);
		
		System.out.printf("%d년 %d월 %d일\n", year, month, date);
		System.out.println(a.get(Calendar.DAY_OF_WEEK));
		System.out.print("이번 년도에서 오늘이 몇 일째인가? : ");
		System.out.println(a.get(Calendar.DAY_OF_YEAR)+"일");
		
		System.out.print("이번달은 며칠까지 있나요? : ");
		System.out.println(a.getActualMaximum(Calendar.DATE));
	}

}
