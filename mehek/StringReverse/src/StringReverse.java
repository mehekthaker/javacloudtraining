import java.util.*;

public class StringReverse {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scanner.nextLine();
		String words[] = str.split(" ");
		String reversedString = "";
		
		for(int i=0; i<words.length; i++)
		{
			String word = words[i];
			String reverseWord = "";
			for(int j=word.length()-1; j>=0; j--)
			{
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println("Reverse string: "+reversedString);
	}

}
