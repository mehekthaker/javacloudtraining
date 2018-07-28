import java.util.*;

public class PalindromeDescendingOrder
{
	public static void main(String args[])
	{
		
		String reversestring = " ";
		String arr=" ";
		int chars[] = new int[10];

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 10 words");
		
		for(int i=0; i<10; i++) 
		{
			arr[i] = scanner.nextInt(); 
			temp = arr[i];		
			while (temp > 0) 
			{
				int remainder = temp % 10;
				reverse_num = reverse_num * 10 + remainder;
				temp = temp / 10;
				digits[i]=digits[i]+1;
			}
		}

		for(int i=0; i<10; i++)
		{	
			for(int j=0; j<10-i-1; j++)
			{
				if(digits[j]<digits[j+1]) 
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		
		System.out.println("Display the descending order");
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}

	}
}
