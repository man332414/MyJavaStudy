package chapter8_1;

public class exam_54_TourGuide 
{
	int choice;
	exam_54_Providable tour;
	
	exam_54_TourGuide(){}
	exam_54_TourGuide(int a)
	{
		if(a==2) 
		{
			tour = new exam_54_JapanTour();
		}
		else
		{
			tour = new exam_54_KoreaTour();
		}
	}
	
	void leisureSports() 
	{
		tour.leisureSports();
	}
	
	void sightseeing()
	{
		tour.sightseeing();
	}
	
	void food()
	{
		tour.food();
	}
}
