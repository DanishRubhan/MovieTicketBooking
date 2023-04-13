import java.util.List;

public class Screen {
    Movie movie;
    int totalNumberOfSeats;
    List<ShowTime> showTimings;


    public Screen(Movie movie, int totalNumberOfSeats, List<ShowTime> showTimings) {
        this.movie = movie;
        this.totalNumberOfSeats = totalNumberOfSeats;
        this.showTimings = showTimings;
    }
}
