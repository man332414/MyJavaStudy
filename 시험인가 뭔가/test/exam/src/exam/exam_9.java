package exam;

import java.io.*;
import java.util.Scanner;

public class exam_9 
{

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		int i = 0;
		try 
		{
			fis = new FileInputStream("src\\exam9.txt");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("result.txt");
			bos = new BufferedOutputStream(fos);
			Scanner sc = new Scanner(fis);
			while(sc.hasNext())
			{
				System.out.println(sc.nextLine());
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			fis.close();
			fos.close();
		}
	}

}
