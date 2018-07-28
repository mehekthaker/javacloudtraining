//Checks whether the login is valid or not, if valid then then they are logged in else after three trials it will display a message

import java.util.*;

class Login
{

	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);

		String val_pwd = "abc345";
		String val_username = "Mehek";
		int count=0;

		while(count!=3)
		{
			System.out.println("Enter your username");
			String usr=sc.nextLine();
			System.out.println("Enter your password");
			String pwd=sc.nextLine();		//prompts the user to enter their credentials

			if(pwd.equals(val_pwd) && usr.equals(val_username))
			{
				System.out.println("Welcome " +usr);
				break;
			}		//if correct then Welcome message
			else
			{
				count++;	//else count is incremented
				
			}
		}
		
		if(count==3)	//Checks if the count has a value 3 in it if so then displays the below message
			{
				System.out.println("Contact Admin");
			}
	}
}