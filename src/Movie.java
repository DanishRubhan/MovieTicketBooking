import java.util.Date;

public class Movie {
    String movieName;
    String language;
    Date releaseDate;
    String genre;
    int duration;

    Catalog catalog;

    public Movie(String movieName, String language, Date releaseDate, String genre, int duration, Catalog catalog) {
        this.movieName = movieName;
        this.language = language;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.duration = duration;
        this.catalog = catalog;
    }

}
