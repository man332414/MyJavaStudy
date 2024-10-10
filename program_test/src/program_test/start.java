package program_test;

import java.util.Scanner;

public class start 
{

	public static void main(String[] args) 
	{
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		join ji = new join();
		getmember gm = new getmember();
		System.out.println("안녕하세요 광수 소프트입니다.");
		while(true) 
		{
			System.out.println("프로그램을 선택해 주십시오");
			System.out.println("0. 종료");
			System.out.println("1. 회원가입");
			System.out.println("2. 휴가신청");
			System.out.println("3. 회원조회");
			//재료확보
			//재료수정
			choice = sc.nextInt();
			if(choice == 0)
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(!(choice>=1 && choice <=3)) 
			{
				System.out.println("잘못된 입력 입니다. 다시 선택해주세요!");
				continue;
			}
			//결과도출
			//System.out.println(choice);
			switch(choice){
				case 1:
					ji.member_join(sc);
					break;
				case 2:
					break;
				case 3:
					gm.allmember();
					break;
				}
		}
		
	}

}
