package chapter5_1;

import java.util.Arrays;

public class exam_28 
{

	public static void main(String[] args) 
	{
		// int[] student = {100, 95, 90, 88, 93};
		int[] student = new int[5];
		
		for(int i = 0; i<student.length; i++) 
		{
			student[i] = (int) (Math.random()*100);
		}
		
		System.out.println(Arrays.toString(student));
		
		int sum = 0;
		
		for(int i = 0; i<student.length; i++) 
		{
			sum += student[i];
		}
		System.out.println(sum / (float)student.length);
	}

}
