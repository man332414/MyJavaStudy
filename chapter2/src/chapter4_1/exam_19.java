package chapter4_1;

public class exam_19 
{

	public static void main(String[] args) 
	{
		int book = 23;
		book = book / 10;
		switch(book){
			case 0: //10권 미만
				System.out.println("분발하세요!");
				break;
			case 1: //10권 이상 20권 이하
				System.out.println("책을 읽는 것을 즐기는 분이군요!");
				break;
			case 2: // 20권 이상 30권 이하
				System.out.println("책을 사랑하는 분이군요!");
				break;
			case 3: // 30권 이상 40권 이하
				System.out.println("당신은 다독왕입니다!!");
				break;
			default :
				System.out.println("분1발하세요!");

		}
	}

}
