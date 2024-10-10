package chapter10_1;

import java.util.Calendar;

public class exam_71 
{

	public static void main(String[] args) 
	{
		Calendar today = Calendar.getInstance();
		Calendar endOfYear = Calendar.getInstance();
		Calendar Christmas = Calendar.getInstance();
		Calendar 푸뇽이출생 = Calendar.getInstance();
		
		endOfYear.set(Calendar.MONTH, 11);
		endOfYear.set(Calendar.DATE, 31);
		long diff = endOfYear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("연말까지 남은 날 : " + diff/(24*60*60*1000)+"일");
		
		Christmas.set(2024, 11, 25);
		diff = Christmas.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("크리스마스까지 남은 날 : " + diff/(24*60*60*1000)+"일");
		
		푸뇽이출생.set(2024, 11, 27);
		diff = 푸뇽이출생.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("푸뇽이 출생까지 남은 날 : " + diff/(24*60*60*1000) + "일");
	}

}
