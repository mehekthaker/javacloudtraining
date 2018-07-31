package com.fileExist;

import java.io.File;
import java.util.Scanner;

public class FileExistApplication {

	public static void main(String args[])
	{
		System.out.println("Enter the file path");
		
		Scanner scanner = new Scanner(System.in);
		String path=scanner.nextLine();
		File file = new File(path);
		
		
		
		if(file.exists())
			System.out.println("The entered file exists");
	}
	
}
