import java.util.*;

public class AbsoluteDifference {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[5];
		int flag = 0;
		
		for(int i=0; i<5; i++)
		{
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter a number");
		int k = scanner.nextInt();
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++) 
			{
				if(arr[i]==arr[j] && i==j && Math.abs(i-j)==k)
				{
					flag=1;
					System.out.println("Number found");
				}
			}
		}
	}

}
