package program_test;

import java.util.Scanner;

public class join 
{
	public void member_join(Scanner input_num) 
	{
		System.out.println("멤버조인 함수도착");
		Scanner input_char = new Scanner(System.in);
		
		System.out.println("회원가입을 위해 입력해주세요");
		System.out.println("이름");
		String name = input_char.nextLine();
		System.out.println("나이");
		int age = input_num.nextInt();
		int holiday = 15;
		System.out.println("전화번호 : -를 빼고 입력해주세요");
		String tel = input_char.nextLine();
		
		member mb = new member();
		mb.setName(name);
		mb.setAge(age);
		mb.setHoliday(holiday);
		mb.setTel(tel);
		
		save.arr.add(mb);
	}
}
