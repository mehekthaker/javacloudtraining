package com.collection.MovieDetails;

import java.util.Scanner;

public class MovieDetailsMain {
	
	public static void main(String args[])
	{
		//List<MovieDetails> list = new ArrayList<>(); 
		Scanner scanner = new Scanner(System.in);
		
		MovieDetailsList detailList = new MovieDetailsList();
		
		detailList.addMovie(new MovieDetails("Iron Man", "Robert Downey Jr.", "Gwyneth Paltrow", "Action"));
		
		detailList.addMovie(new MovieDetails("Fault in our stars", "Ansel Elgort", "Shailene Woodley", "Drama"));
		
		detailList.addMovie(new MovieDetails("A walk to remember", "Shane West", "Mandy Moore", "Drama"));
		
		detailList.addMovie(new MovieDetails("Mission Impossible", "Tom Cruise", "Rebecca Ferguson", "Action/Adventure"));
		
		detailList.addMovie(new MovieDetails("Logan", "Hugh Jackman", "Dafne Keen", "Drama/Science Fiction"));
		
		detailList.addMovie(new MovieDetails("Twilight", "Robert Pattinson", "Kristen Stewart", "Drama/Fantasy"));
		
		detailList.findMovieByGenre("Drama");
		
		detailList.removeMovie(scanner.next());
		
		detailList.removeAllMovie(null);
	}

}
