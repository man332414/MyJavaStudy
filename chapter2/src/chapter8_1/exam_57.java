package chapter8_1;

public class exam_57 
{
	static class StaticInner{}
	class InstanceInner{}
	
	StaticInner st1 = new StaticInner();
	InstanceInner ii1 = new InstanceInner();
	
	static void StaticMethod() 
	{
		StaticInner st2 = new StaticInner();
//		Instance ii2 - new InstanceInner();
	}
	
	void InstanceMethod() 
	{
		StaticInner st3 = new StaticInner();
		InstanceInner ii3 = new InstanceInner();
	}
}
