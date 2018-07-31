package com.collection.MovieDetails;

public class MovieDetails {
	
	private String movieName;
	private String leadActor;
	private String leadActress;
	private String genre;
	
	MovieDetails(String movieName, String leadActor, String leadActress, String genre)
	{
		this.movieName=movieName;
		this.leadActor=leadActor;
		this.leadActress=leadActress;
		this.genre=genre;
	}
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", leadActor=" + leadActor + ", leadActress=" + leadActress
				+ ", genre=" + genre + "]";
	}
	
	
	
	
	
	

}
