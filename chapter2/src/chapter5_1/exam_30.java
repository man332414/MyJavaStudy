package chapter5_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class exam_30 
{

	public static void main(String[] args) 
	{
		String[] a = {"java", "Hello", "programming"};
		
		for(String i : a)
		{
//			System.out.println(i);
		}
		
		int[][] b = {
				
				{1, 2, 3}, 
				{2, 3, 4}, 
				{3, 4, 5}, 
				{4, 5, 6}, 
				{5, 6, 7}
				
				};
		
//		System.out.println(Arrays.toString(Arrays.toString(b)));
		
		for(int[] i : b) 
		{
			for(int j : i)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
