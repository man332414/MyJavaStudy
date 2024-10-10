package chapter4_1;

import java.util.Arrays;

public class extra_exam_2_1 
{

	public static void main(String[] args) 
	{
//		for(int i = 1; i<=10; i++)
//		{
//			System.out.print(i + " ");
//		}
		
//		for(int i = 0; i<4; i++)
//		{
//		  System.out.println(i);
//		};
//		
//		int i = 0;
//		while(i<4) // 조건식 생략 불가
//		{
//		  System.out.println(i);
//		  i++;
//		};
//		
//		i=0;
//		do
//		{
//			System.out.println(i);
//			i++;	
//		}
//		while(i<4);
		
//		int i = 1;
//		while(true)
//		{
//		  System.out.println(i+"번 반복중입니다.");
//		  i++;
//		  if(i>=10)
//		  {
//		    break;
//		  }
//		int i = 1;
//		boolean j = true;
//		System.out.println((int)j);
//		while(true)
//		{
//		  if(i%2==0)
//		  {
//		    System.out.println(i+"번 반복중입니다.");
//		  }
//
//		  i++;
//
//		  if(i>=10)
//		  {
//		    break;
//		  }
////		}
//		
//		}
		int[] a = new int[100];

		for(int i = 0; i<a.length; i++)
		{
		  a[i] = i;
		}

		for(int i = 0; i<a.length; i++)
		{
		  System.out.println(a[i]);
		}
		
		System.out.println(Arrays.toString(a));
		
	}
}
