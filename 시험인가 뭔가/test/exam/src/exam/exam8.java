package exam;

import java.util.Scanner;

public class exam8 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("학생 이름을 입력하세요 \t 0.뒤로가기");
			String name = sc.nextLine();
			
			System.out.println(name + "학생의 국어 점수를 입력하세요");
			int kor = sc.nextInt();
			System.out.println(name + "학생의 슈학 점수를 입력하세요");
			int math = sc.nextInt();
			System.out.println(name + "학생의 영어 점수를 입력하세요");
			int eng = sc.nextInt();				
			exam8_student s1 = new exam8_student(name, kor, math, eng);
			if(name.equals("0"))
			{
				System.out.println("프로그램이 종료됩니다.");
				break;
			}					
		}
				
		//int kim[] = {kor, math, eng};
/*		s1.total();
		int avg = s1.avg();
				
		//System.out.println(avg);
		if (avg>=90) 
		{
			System.out.println("A");
		}
		else if(avg>=80)
		{
			System.out.println("B");
		}
		else if(avg>=70)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("F");
		}*/
			
	}

}
