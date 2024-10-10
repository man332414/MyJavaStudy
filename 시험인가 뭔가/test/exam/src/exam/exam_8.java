package exam;

import java.util.ArrayList;

public class exam_8 
{

	public static void main(String[] args) 
	{
		ArrayList arr = new ArrayList();
		
		arr.add(0, "A");
		arr.add(1, "C");
		arr.add(2, "E");
		arr.add(3, "D");
		
		System.out.print(" 초기상태 : ");
		System.out.println(arr);
		
		System.out.println(" 인덱스 1 위치에 B 추가 : ");
		arr.add(1, "B");
		System.out.println(arr);
		
		System.out.println(" 인덱스 2 위치의 값 삭제 : ");
		arr.remove(2);
		System.out.println(arr);
		
		System.out.println(arr.get(2));
	}

}
