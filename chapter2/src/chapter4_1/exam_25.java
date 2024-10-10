package chapter4_1;

import java.util.Scanner;

public class exam_25 
{

	public static void main(String[] args) 
	{
		//재료준비
		int money = 10000;
		System.out.printf("현재 가진 돈은 %d입니다. \n", money);
		Scanner sc = new Scanner(System.in);		
		//재료가공
		//출력
		while(true)
		{
			System.out.println("얼마를 사용하시겠습니까?");
			int spended = sc.nextInt();
			if(spended<0 || spended>10000) 
			{
				System.out.println("잘못된 값이 입력되었습니다. 다시 입력해 주세요");
				continue;
			}
			
			money -= spended;
			System.out.printf("사용한 돈은 %d 입니다.", spended);
			System.out.printf("남은 돈은 %d 입니다.\n", money);
			
			if(money<=0) 
			{
				System.out.println("가진 돈을 모두 사용했습니다. 파산했습니다.");
				break;
			}
		}
	}

}
