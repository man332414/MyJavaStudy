package chapter7_1;

public class builder 
{
	String name;
	public builder setName(String name)
	{
		this.name = name;
		System.out.println(this);
		return this;
	}
	builder(){}
	public static void main(String[] args) 
	{
		builder cls = new builder();
		cls.setName("울집");
		System.out.println(cls);
	}

}
