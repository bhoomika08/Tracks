package movieApp;
import java.util.ArrayList;
import java.util.Random;

public class Movie {
  private String name;
  private int year;
  private String language;
  private String genre;
  private String releaseDate;
  private Boolean blockbuster;
  private MovieType type;

  private static ArrayList<Movie> allMoviesList = new ArrayList<Movie>();

  public Movie(String name, int year, String language, String genre, String releaseDate, Movie.MovieType type) {
    this.name = name;
    this.year = year;
    this.language = language;
    this.genre = genre;
    this.releaseDate = releaseDate;
    this.type = type;
    allMoviesList.add(this);
  }

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

  // Getting name of movie
  public String getName() {
    return name;
  }

  // Getting all Movies
  public static ArrayList<Movie> getAllMovies() {
    return allMoviesList;
  }

  // Getting Movies by type
  public static ArrayList<Movie> getMoviesByType(Movie.MovieType type) {
    ArrayList<Movie> moviesListByType = new ArrayList<Movie>();
    for(int movieCount = 0; movieCount < allMoviesList.size(); movieCount++) {
      if(allMoviesList.get(movieCount).type == type) {
        moviesListByType.add(allMoviesList.get(movieCount));
      }
    }
    return moviesListByType;
  }

  public boolean isBlockbuster() {
    if(blockbuster == null) {
      Random random = new Random();
      this.blockbuster = random.nextBoolean();
    }
    return this.blockbuster;
  }
}
