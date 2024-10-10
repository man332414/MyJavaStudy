package exam;

public class exam10 
{

	public static void main(String[] args) 
	{
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
				};
		int total = 0;
		int average = 0;
		int i=0;
		int j=0;
		for(i = 0; i < arr.length; i++)
		{
			//System.out.println(i);
			for(j = 0; j < arr[i].length; j++) 
			{
				//System.out.println(j);
				total += arr[i][j];
			}
		}
		//System.out.println(i + ", " +j);
		average = total / (i * j);
		System.out.println("total = " + total);
		System.out.println("average = " + average);
		//System.out.println(325/20);
	}

}
