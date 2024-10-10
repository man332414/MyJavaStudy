package chapter6_1;

class Cellphone{
	String model = "Galaxy 8";
	String color;
	int capacity;
	
	Cellphone(){}
	Cellphone(String color, int capacity)
	{
		this.color = color;
		this.capacity = capacity;
	}
}

public class exam_39 
{

	public static void main(String[] args) 
	{
		Cellphone myphone1 = new Cellphone();
		
		Cellphone myphone2 = new Cellphone("Silver", 64);
		
		System.out.println(myphone2.model);
		System.out.println(myphone2.color);
		System.out.println(myphone2.capacity);
		
		System.out.println(myphone1.model);
		System.out.println(myphone1.color);
		System.out.println(myphone1.capacity);
	}

}
