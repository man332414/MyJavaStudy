package chapter10_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exam_76 
{

	public static void main(String[] args) 
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src\\sample.txt");
		} 
		catch (FileNotFoundException e) 
		{ 
			e.printStackTrace();
		}
		Scanner sc = new Scanner(fis);
		while(sc.hasNext()) //값이 존재하면 계속해서 반복
		{
			System.out.println(sc.nextLine()); //출력
		}
	}

}
