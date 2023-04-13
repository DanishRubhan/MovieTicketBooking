import java.util.Date;
import java.util.List;

public class Booking {
    Movie movie;
    ShowTime showTime;
    int totalSeats;
    Seat seat;
    Payment payment;

    public Booking(Movie movie, ShowTime showTime, int totalSeats, Seat seat, Payment payment) {
        this.movie = movie;
        this.showTime = showTime;
        this.totalSeats = totalSeats;
        this.seat = seat;
        //print options for credit and cash . Plan accordingly
        this.payment=payment;
    }

}
