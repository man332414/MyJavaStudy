package exam;

import java.util.Random;

public class exam_7 
{
	public static void main(String[] args)
	{
		Random r1 = new Random();
		int dice1;
		int dice2;
		int cnt = 0;
		
		while(true)
		{
			dice1 = r1.nextInt(5)+1;
			dice2 = r1.nextInt(5)+1;
			System.out.print(dice1 + " ");
			System.out.println(dice2);
			if(dice1 == dice2)
			{
				System.out.println("떠블입니다 축하합니다");
				cnt++;
			}
			if(cnt == 3)
			{
				System.out.println("떠블이 3회 나와서 주사위 굴리기를 종료합니다.");
				break;
			}
		}
	}
}
