package chapter11_1;

import java.util.ArrayList;

class oj 
{
	String name;
	int age;
	oj(){}
	oj(String a, int b)
	{
		name = a;
		age = b;
	}
}

public class exam_90 
{

	public static void main(String[] args) 
	{
		oj o = new oj("이름", 33);
		ArrayList list1 = new ArrayList();
		list1.add(o);
		list1.add("C");
		list1.add("E");
		list1.add("D");
		
		System.out.print("초기 상태 : ");
		System.out.println(list1);
		
		System.out.println("인텍스 1 위치에 B 추가");
		list1.add(1, "B");
		System.out.println(list1);
		
		System.out.println("인덱스 2 위치의 값 삭제 : ");
		list1.remove(2);
		System.out.println(list1);
		
		System.out.println("인덱스 0번 위치의 값 반환 : " + list1.get(0));
	}

}
