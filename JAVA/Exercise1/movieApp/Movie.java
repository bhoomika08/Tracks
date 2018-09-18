package movieApp;
import java.util.ArrayList;
import java.util.Random;

public class Movie {
  String dish;
  String name;
  int year;
  String language;
  String genre;
  String releaseDate;
  Boolean blockbuster;

  static ArrayList<Movie> allMoviesList = new ArrayList<Movie>();

  public Movie(String name, int year, String language, String genre, String releaseDate) {
    this.name = name;
    this.year = year;
    this.language = language;
    this.genre = genre;
    this.releaseDate = releaseDate;
    allMoviesList.add(this);
  }

  MovieType type;

  enum MovieType {
    TOLLYWOOD("Dosa"), HOLLYWOOD("Pepper Steak"), BOLLYWOOD("Dal Makhani");

    private String dish;
    MovieType(String dish) {
      this.dish = dish;
    }

    public String getDish() {
      return dish;
    }
  }

  // Getting all Movies
  public static void getAllMovies() {
    System.out.println("List of all Movies:");
    for(int movieCount = 0; movieCount < allMoviesList.size(); movieCount++) {
      System.out.println("->" + allMoviesList.get(movieCount).name);
    }
    System.out.println();
  }

  // Getting Movies by type
  public static void getMoviesByType(Movie.MovieType type) {
    System.out.println("List of " + type + " Movies:" );
    for(int movieCount = 0; movieCount < allMoviesList.size(); movieCount++)
    if(allMoviesList.get(movieCount).type == type) {
      System.out.println("-> " + allMoviesList.get(movieCount).name);
    }
    System.out.println();
  }

  public boolean isBlockbuster() {
    if(blockbuster == null) {
      Random random = new Random();
      this.blockbuster = random.nextBoolean();
    }
    return this.blockbuster;
  }
}