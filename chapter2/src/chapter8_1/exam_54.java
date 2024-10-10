package chapter8_1;

import java.util.Scanner;

public class exam_54 
{

	public static void main(String[] args) 
	{
		System.out.println("안녕하세요 고객님 \n여행상품을 골라주세요");
		System.out.println("1. 한국여행 2. 일본여행");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		exam_54_TourGuide guide = new exam_54_TourGuide(choice);
		
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
	}

}
