package chapter8_1;

public class exam_54_JapanTour implements exam_54_Providable 
{

	@Override
	public void leisureSports() 
	{
		System.out.println("도쿄타워 번지점프 투어");	
	}

	@Override
	public void sightseeing() 
	{
		System.out.println("오사카 관람투어");
	}

	@Override
	public void food() 
	{
		System.out.println("초밥 투어");
	}
	
}
