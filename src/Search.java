import java.util.Date;
import java.util.List;

interface Search {

    public List<Movie> searchMovieTitle(String title);
    public List<Movie> searchMovieLanguage(String language);
    public List<Movie> searchMovieGenre(String genre);
}
