package chapter7_1;

public class exam_52_poly2 {

	public static void main(String[] args) 
	{
		exam_52_Lion lion = new exam_52_Lion();
		exam_52_ZooKeeper2 james = new exam_52_ZooKeeper2();
		
		james.feed(lion);
		exam_52_Rabbit rabbit = new exam_52_Rabbit();
		exam_52_Monkey monkey = new exam_52_Monkey();
		james.feed(rabbit);
		james.feed(monkey);
		james.listen(lion);
	}

}
