import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;


public class ShowTime {
    Time startTime;
    int duration;
    Date date;

    List<Seat> seats;

    public ShowTime(Time startTime, int duration, Date date, int numberOfSeats) {
        this.startTime = startTime;
        this.duration = duration;
        this.date = date;
        this.seats=new ArrayList<Seat>(numberOfSeats);
        //calculate the seats for Gold,Silver,Platinum accordingly
        for(int i=0;i<numberOfSeats;i++) {
            this.seats.add(new Silver("Seat"+(i+1),true));
        }

    }

    public void updateSeatStatus(List<Seat> seats) {
        for (Seat seat : seats) {
            seat.seatStatus = true; // set seat status to available
        }
    }

    public void showAvailableSeats() {
        // this functionality
        System.out.println("Available Seats");
        for (Seat seat : seats) {
            if (seat.seatStatus) {
                System.out.println(seat.seatNo);
            }
        }
    }
}
