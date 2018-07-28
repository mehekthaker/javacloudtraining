//Counts the number of Armstrong numbers between 100-999

import java.util.Scanner;

class ArmstrongCount
{
	public static void main(String args[])
	{
		int n=100, count=0;
		int temp;

		while(n!=1000)		//counts the number of Armstrong numbers between 100-999
		{
			int sum=0;
			temp=n;

			while(temp!=0)	//Calculates the armstrong number
			{
				int remainder = temp%10;
				sum = sum+(remainder*remainder*remainder);
				temp = temp/10;
			}

		if(n==sum)
		{
			count++;
		}

			n++;		
		}
	System.out.println("There are "+count+" Armstrong numbers between 100-999");
	}
}