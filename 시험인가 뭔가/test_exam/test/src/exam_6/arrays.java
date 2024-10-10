package exam_6;

//import java.util.Arrays;

public class arrays 
{

	public static void main(String[] args) 
	{
		char[] arr = new char[10000];
		int i = 0;
		
		while(true)
		{
			arr[i] = (char)(i+48);
			System.out.println(arr[i]);
			i++;
//			if(i%50 == 0) 
//			{
//				System.out.println();
//			}
			if(i>=arr.length)
			{
				break;
			}
		}
//		System.out.println(Arrays.toString(arr));
//		for(char j : arr)
//		{
//			System.out.print(j);
//		}
	}

}
