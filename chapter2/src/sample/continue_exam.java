package sample;

public class continue_exam 
{

	public static void main(String[] args) 
	{
		int i = 1;
		int j = 0;
		while(true)
		{
		  if(i<=10)
		  {		
			  if(i%3==0) // 짝수 반복만 출력
			  {
				  System.out.println("3의 약수 : " + i);
				  j++;
			  }
			  i++;
			  continue;
		  }
		  else
		  {
			  System.out.print("1에서 " + (i-1) + "까지의 숫자 중 ");
			  System.out.println("3의 약수는 " +j+"개 입니다.");
			  break; // i가 10이 넘으면 반복문 멈춤
		  }
		}
	}

}
