package com.collection.MovieDetails;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MovieDetailsList {

	List<MovieDetails> list = new LinkedList<>(); 
	//HashMap<String, MovieDetails> mvDetails = new HashMap<>();
	int flag=0;
	MovieDetails movies = new MovieDetails();
	
  public void addMovie(MovieDetails movieDetails)
  {
	 
	  list.add(movieDetails);
	  //System.out.println(movieDetails);
  }
  
  
  public void removeMovie(String string, MovieDetails mvDetails)
  {
	
	  if(mvDetails.getMovieName().equals(string))
		  list.remove(string);
  }
  
  
  public void removeAllMovie(MovieDetails movieDetails)
  {	
	  list.clear();
  }
	
  
  public void findMovieByMovieName(String movieName)
  {
	 
	for(MovieDetails mov: movies) {
		if(mov.getGenre().equals(movieName)) {
			flag=1;
			System.out.println(mov);	
		}
	}
	
  }
  
  
  public void findMovieByGenre(String genre)
  {
	
	MovieDetails mvDetail2 = mvDetails.get(genre);
	System.out.println(mvDetail2);
  }
  
  
  
	
}
