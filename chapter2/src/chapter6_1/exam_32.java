package chapter6_1;

public class exam_32 
{

	public static void main(String[] args) 
	{
		car mycar = new car();
		System.out.println("시동 처음 초기화 : " + mycar.powerOn);
		System.out.println("차의 색상 초기화 : " + mycar.color);
		System.out.println("바퀴의 수 초기화 : " + mycar.wheel);
		System.out.println("속력 초기화 : " + mycar.speed);
		System.out.println("와이퍼 작동 초기화 : " + mycar.wiperOn);
		
		mycar.power();
		System.out.println("시동 메서드 동작 : " + mycar.powerOn);
		mycar.power();
		System.out.println("시동 메서드 다시 동작 : " + mycar.powerOn);
		
		mycar.color = "black";
		System.out.println("현재 차의 색상 : " + mycar.color);
		
		System.out.println(mycar);
//		car.number = 10;
//		car yourscar = new car();
//		System.out.println(mycar.number);
//		System.out.println(yourscar.number);
	}

}
