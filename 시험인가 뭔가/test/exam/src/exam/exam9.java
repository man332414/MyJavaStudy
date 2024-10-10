package exam;

import java.util.Scanner;

public class exam9 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("x를 입력하여 프로그램을 종료하세요");
		String input_x = input.nextLine();
		//System.out.println(input_x.equals("x"));
		while(true)
		{
			if(input_x.equals("x")) 
			{
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
