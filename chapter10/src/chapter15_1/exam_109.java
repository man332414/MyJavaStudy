package chapter15_1;

import java.net.*;

public class exam_109 
{

	public static void main(String[] args) 
	{
		InetAddress ip = null;
		try 
		{
			ip = InetAddress.getByName("www.daum.net");
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress : " + ip.getHostAddress());
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		try 
		{
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress : " + ip.getHostAddress());
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("error");
		}
		try 
		{
			ip = InetAddress.getByName("www.papagokakao.com");
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress : " + ip.getHostAddress());
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		/*try 
		{
			ip = InetAddress.getByName("www.daum.net");
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress : " + ip.getHostAddress());
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}*/
	}

}
