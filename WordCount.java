package com.file.WordCount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class WordCount {
	
	public static void main(String args[]) throws IOException 
	{
		System.out.println("Enter the file path");
		
		Scanner scanner = new Scanner(System.in);
		String path=scanner.nextLine();
		File file = new File(path);
		
		int wordCount = 0;
	
		
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		String line ;
		while((line = reader.readLine()) != null)
		{
			String wordList[] = line.split("\\s+");
		
			wordCount += wordList.length;			
		}
		reader.close();
		

		System.out.println("Total word count in the file is "+wordCount);

	}
}
