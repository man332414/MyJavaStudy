package chapter7_1;

public class exam_52_poly3 {

	public static void main(String[] args) 
	{
		exam_52_Animal lion = new exam_52_Lion();
		exam_52_ZooKeeper3 james = new exam_52_ZooKeeper3();
		
		james.feed(lion);
		exam_52_Animal rabbit = new exam_52_Rabbit();
		exam_52_Animal monkey = new exam_52_Monkey();
		james.feed(rabbit);
		james.feed(monkey);
	}

}
