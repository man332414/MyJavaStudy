package chapter4_1;

import java.util.Scanner;

public class exam_17_1 
{
	char Func(char x) 
	{
		x = (char)((int)x+1);
		return x;
	}
	
	public static void main(String[] args) 
	{
		//입력받은 나이를 통해서 알맞은 출력을 선택하는 프로그램
		//재료 수집 : 변수선언(chapter2(변수), chapter5(배열))
		/* 변수 초기화 방법
		   1. 수동적으로 정적 생성 : int a = 3;
		   2. 함수를 통해서 동적 생성 : 라이브러리 활용
		*/
		exam_17_1 a = new exam_17_1();
		int age;
		String here = "안녕하세오";
		here= "바보씨";
		char here_1 = (char)((int)(here.charAt(1) + 1));
		System.out.println(here_1);
		a.Func(here_1);
		System.out.println(here_1);
		System.out.println(here);
		//콘솔을 통해 값을 입력받기 위한 객체
		Scanner sc = new Scanner(System.in); // 콘솔을 제어할 수 있는 객체 System.in 시스템은 클래스, in은 클래스변수
		//재료 손질 : 변수를 연산(chapter3(연산자), 4(제어문))
		System.out.println("나이를 입력해 주세요!");
		age = sc.nextInt();
		
//		System.out.println(age);
		//결과 도출(chapter4(제어문))
		if(age>=19) {System.out.println("성인입니다.");}
		else if(age>=13) {System.out.println("청소년입니다.");}
		else if(age>=8) {System.out.println("어린이입니다.");}
		else {System.out.println("유아입니다.");}
	}

}
