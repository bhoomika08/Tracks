package movieApp;

import movieApp.Movie.MovieType;

public class Main {
	public static void main(String[] args) {
	  Movie tollywood = new Movie("Officer", 2018, "Telugu", "Crime", "01-06-2018");
	  tollywood.type = Movie.MovieType.TOLLYWOOD;

	  Movie bollywood = new Movie("OMG", 2018, "Hindi", "Comedy", "03-08-2018");
	  bollywood.type = Movie.MovieType.BOLLYWOOD;

	  Movie hollywood = new Movie("Interstellar", 2014, "English", "Science fiction", "07-11-2014");
	  hollywood.type = Movie.MovieType.HOLLYWOOD;

	  // Getting Dish Served for Particular Movie Type
	  for(MovieType mt: MovieType.values()) {
		  System.out.println(mt + " " + mt.getDish());
	  }

	  System.out.println();

	  // Get All Movies
	  Movie.getAllMovies();

	  // Get all Movies of a type
	  Movie.getMoviesByType(Movie.MovieType.TOLLYWOOD);
	  Movie.getMoviesByType(Movie.MovieType.HOLLYWOOD);
	  Movie.getMoviesByType(Movie.MovieType.BOLLYWOOD);

	  // Finding is a movie blockbuster?
	  System.out.println("Is " + tollywood.name + " blockbuster? (First Time) " + tollywood.isBlockbuster());
	  System.out.println("Is " + tollywood.name + " blockbuster? (Second Time) " + tollywood.isBlockbuster());
	  System.out.println();  
	}
}