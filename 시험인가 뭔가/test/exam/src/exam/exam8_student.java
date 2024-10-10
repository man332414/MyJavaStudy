package exam;

public class exam8_student 
{
	String name;
	int kor;
	int math;
	int eng; 
	int total;
	int avg;
	
	exam8_student(){}
	exam8_student(String name, int kor, int math, int eng)
	{
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	int total()
	{
		total = kor + math + eng;
		return total;
	}
	
	int avg()
	{
		avg = total/3;
		return avg;
	}
}
