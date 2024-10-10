package thenjava_1;

import java.net.*;
import java.io.*;

public class exam_111 
{

	public static void main(String[] args) 
	{
		try 
		{
			String serverIp = "172.16.1.52";
			System.out.println("서버에 연결을 시도하는 중...");
		
			Socket socket = new Socket(serverIp, 8000);
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			System.out.println("서버로부터 받은 메세지 : " + dis.readUTF());
			dis.close();
			socket.close();
			System.out.println("연결이 종료되었습니다.");
		}
		catch (Exception e) {e.printStackTrace();}

	}
}
