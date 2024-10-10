package chapter10_1;

import java.time.LocalDate;

public class exam_83 
{
	public static void main(String[] args)
	{
		LocalDate Id = LocalDate.now();
		System.out.println(Id);
		
		LocalDate new_Id = Id.withYear(1999)
				.withMonth(8)
				.withDayOfMonth(23); //chaining
		System.out.println(new_Id);
	}
}
