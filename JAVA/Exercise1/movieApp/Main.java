package movieApp;
import movieApp.Movie.MovieType;
import java.util.ArrayList;

public class Main {
  private static ArrayList<Movie> moviesList;

  public static void printMoviesList() {
    for(int movieCount = 0; movieCount < moviesList.size(); movieCount++) {
      System.out.println("-> " + moviesList.get(movieCount).getName());
    }
  }

  public static void main(String[] args) {

    Movie tollywood = new Movie("Officer", 2018, "Telugu", "Crime", "01-06-2018", Movie.MovieType.TOLLYWOOD);
    new Movie("OMG", 2018, "Hindi", "Comedy", "03-08-2018", Movie.MovieType.BOLLYWOOD);
    new Movie("Interstellar", 2014, "English", "Science fiction", "07-11-2014", Movie.MovieType.HOLLYWOOD);

    // Getting Dish Served for Particular Movie Type
    for(MovieType mt: MovieType.values()) {
      System.out.println(mt + " " + mt.getDish());
    }
    System.out.println();

    // Get All Movies
    System.out.println("List of all Movies:");
    moviesList = Movie.getAllMovies();
    printMoviesList();
    System.out.println();

    // Get all Movies of TollyWood type
    System.out.println("List of all TollyWood Movies");
    moviesList = Movie.getMoviesByType(Movie.MovieType.TOLLYWOOD);
    printMoviesList();
    System.out.println();

    //Get all Movies of BollyWood type
    System.out.println("List of all BollyWood Movies");
    moviesList = Movie.getMoviesByType(Movie.MovieType.BOLLYWOOD);
    printMoviesList();
    System.out.println();

    //Get all Movies of HollyWood type
    System.out.println("List of all HollyWood Movies");
    moviesList = Movie.getMoviesByType(Movie.MovieType.HOLLYWOOD);
    printMoviesList();
    System.out.println();

    // Finding is a movie blockbuster?
    System.out.println("Is " + tollywood.getName() + " blockbuster? (First Time) " + tollywood.isBlockbuster());
    System.out.println("Is " + tollywood.getName() + " blockbuster? (Second Time) " + tollywood.isBlockbuster());
    System.out.println();
  }
}
