package chapter8_1;

public class exam_54_KoreaTour implements exam_54_Providable 
{

	@Override
	public void leisureSports() 
	{
		System.out.println("한강에서 수상스키 투어");	
	}

	@Override
	public void sightseeing() 
	{
		System.out.println("경복궁 관람 투어");
	}

	@Override
	public void food() 
	{
		System.out.println("전주 비빔밥 투어");
	}
	
}
