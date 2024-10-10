package chapter8_1;

public class exam_58 
{

	public static void main(String[] args) 
	{
		exam_58_OuterClass oc = new exam_58_OuterClass();
		System.out.println("OuterClass의 a값 = "+ oc.a);
		System.out.println("OuterClass의 b값 = "+ exam_58_OuterClass.b);
		
		System.out.println("\n ===inner 클래스 접근하기 ===");
		exam_58_OuterClass oc2 = new exam_58_OuterClass();
		exam_58_OuterClass.Inner i = oc2.new Inner();
		
		System.out.println("Inner의 c값 " + i.c);
		i.innerMethod();
		
		exam_58_OuterClass.StaticInner si = new exam_58_OuterClass.StaticInner();
		System.out.println("StaticInner의 d값 " + si.d);
		
		si.staticMethod();
		exam_58_OuterClass.StaticInner.staticMethod();
	}

}
