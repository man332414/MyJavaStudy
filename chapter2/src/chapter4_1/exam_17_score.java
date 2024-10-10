package chapter4_1;

public class exam_17_score 
{

	public static void main(String[] args) 
	{
		int kor = 89;
		int eng = 63;
		int math = 100;
		int total = 0;
		float avg;
		
		total += kor;
		total += eng;
		total += math;
		
		avg = (float)(total/3);
		System.out.println(avg);
		System.out.println(total);
	}
}
