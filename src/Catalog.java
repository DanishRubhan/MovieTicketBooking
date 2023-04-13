import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Catalog implements Search{
    HashMap<String, List<Movie>> movieTitles;
    HashMap<String, List<Movie>> movieLanguages;
    HashMap<String, List<Movie>> movieGenres;

    @Override
    public List<Movie> searchMovieTitle(String title) {
        return movieTitles.get(title);
    }

    @Override
    public List<Movie> searchMovieLanguage(String language) {
        return movieLanguages.get(language);
    }

    @Override
    public List<Movie> searchMovieGenre(String genre) {
        return movieGenres.get(genre);
    }

}
