package chapter10_1;

import java.time.LocalDate;

public class exam_81 
{

	public static void main(String[] args) 
	{
		LocalDate Id = LocalDate.now();
		System.out.println(Id);
		
		LocalDate Id2 = Id//.of(2022, 12, 20);
				.minusYears(2)
				.plusMonths(3)
				.minusDays(4);
		
		System.out.println(Id2);
		
		LocalDate Id3 = Id2.minusDays(3);
		System.out.println(Id3);
		
		LocalDate Id4 = Id3.plusWeeks(3);
		System.out.println(Id4);
	}

}
