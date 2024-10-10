package chapter7_1;

public class exam_46_User
{
	private String name;
	private int age;
	exam_46_User(){}
	exam_46_User(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
}
