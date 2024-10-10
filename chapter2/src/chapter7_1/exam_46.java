package chapter7_1;

public class exam_46 
{

	public static void main(String[] args) 
	{
		exam_46_User young = new exam_46_User("영희", 19);
		exam_46_User chul = new exam_46_User("철수", 20);
      
		System.out.println(young.getName());
//		young.age = 199;
		System.out.println(young.getAge());
		String cName = chul.getName();
		String yName = young.getName();
		if(cName.equals(yName))
		{
			System.out.println("same name");
		}
		else
			System.out.println(cName.equals(yName));
	}

}
