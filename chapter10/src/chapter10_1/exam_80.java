package chapter10_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class exam_80 
{

	public static void main(String[] args) 
	{
		Date day = new Date();
		String pattenKorea = "yyyy-MM-dd";
		String pattenUSA = "MM-dd-yyyy";
		String pattenUK = "dd-MM-yyyy";
		String patten1 = "E요일 HH시 mm분 ss초";
		
		SimpleDateFormat p1 = new SimpleDateFormat(pattenKorea);
		SimpleDateFormat p2 = new SimpleDateFormat(pattenUSA);
		SimpleDateFormat p3 = new SimpleDateFormat(pattenUK);
		SimpleDateFormat p4 = new SimpleDateFormat(patten1);
		
		System.out.println("현재 날짜 " + day);
		System.out.println("한국형식 (년, 월, 일) " + p1.format(day));
		System.out.println("미국형식 (월, 일, 년) " + p2.format(day));
		System.out.println("영국형식 (일, 월, 년) " + p3.format(day));
		System.out.println(p4.format(day));
	}

}
