package chapter5_1;

public class exam_4_1 
{

	public static void main(String[] args) 
	{
		int[] arr = {99, 32, 22, 87, 140};
		
		for(int i = 0; i<arr.length-1;i++)
		{
			for(int j= i+1; j<arr.length; j++)
			{
				int tmp = 0;
				if(arr[i]>arr[j])
				{
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i =0; i<arr.length; i++)
		{
			System.out.println(arr[i]);			
		}
	}

}
