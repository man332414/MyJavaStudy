package chapter8_1;

public class exam_58_OuterClass 
{
	int a = 3;
	static int b = 4;
	
	class Inner
	{
		int c = 5;
		
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	static class StaticInner
	{
		int d = 6;
		static int stat = 10;
		
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}

