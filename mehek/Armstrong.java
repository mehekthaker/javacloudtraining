//Checks whether the given number is Armstrong or not

import java.util.Scanner;

class Armstrong{
	public static void main(String args[])
{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();	//Takes the input from the user

		int sum=0, temp;

		temp=n;


		while(temp!=0)
		{
			int r = temp%10;
			sum = sum+(r*r*r);
			temp = temp/10;
		}//adds the cube of the remainder obtained until the variable temp is 0 

	if(n==sum)
	{
		System.out.println("It is an Armstrong number");
	}
	else
		System.out.println("It is not an Armstrong number");
	
	}
}