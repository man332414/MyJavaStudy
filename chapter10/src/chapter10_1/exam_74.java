package chapter10_1;

import java.util.Random;
import java.util.Scanner;

public class exam_74 
{

	public static void main(String[] args) 
	{
		Random rd = new Random();
		// 1 ~ 6 사이의 값을 랜덤하게 추출
		String answer = "y";
		Scanner input = new Scanner(System.in);
		
		while(answer.equals("y")) 
		{
			int first = rd.nextInt(6)+1;
			int second = rd.nextInt(6)+1;
			System.out.println("주사위를 굴리겠습니까? y or n");
			answer = input.nextLine();
			System.out.println("첫 번째 주사위 값 : " + first);
			System.out.println("두 번째 주사위 값 : " + second);
			
			if(first == second)
			{
				System.out.println("double!!");
				break;
			}
		}
		
	}

}
