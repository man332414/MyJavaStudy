package chapter10_1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class exam_87 
{

	public static void main(String[] args)
	{
		LocalDateTime ldt1 = LocalDateTime.of(2010,1,1,12,23,23,444);
		System.out.println(ldt1);
		
		LocalDateTime ldt2 = LocalDateTime.of(2010, 12, 25, 1, 12, 2, 232);
		System.out.println(ldt2);
		
		System.out.println(ldt1.isAfter(ldt2));
		System.out.println(ldt1.isBefore(ldt2));
		System.out.println(ldt1.isEqual(ldt2));
		
		LocalDateTime start = LocalDateTime.of(2024,  1, 1, 10, 0);
		LocalDateTime end= LocalDateTime.of(2024,  1, 2, 10, 0);
		
		Duration duration = Duration.between(start, end);
		System.out.println("두 날짜 사이의 차이(초)" + duration.getSeconds());
		
		long hour = start.until(end, ChronoUnit.HOURS);
		System.out.println("두 날짜 사이의 시간(시간)" + hour);
		
	}

}
