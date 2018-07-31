package com.file.GrepFile;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GrepFile {
	
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter the file path");
		
		Scanner scanner = new Scanner(System.in);
		String path=scanner.nextLine();
		
		System.out.println("Enter the string to be searched");
		String string = scanner.nextLine();
		
		File file = new File(path);
		
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		String line ;
		int lineCount = 0;
		int flag = 0;
		
		while((line = reader.readLine()) != null) {
			lineCount++;
			if(line.contains(string)) {
				flag = 1;
				System.out.println("Line number is "+lineCount+" Line: "+line);
			}
		
		}
		if(flag == 0) {
			System.out.println("String "+string+" not found");
		}

	}
}
