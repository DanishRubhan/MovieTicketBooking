import java.util.List;

abstract public class Seat {
    String seatNo;
    boolean seatStatus;

    public Seat(String seatNo, boolean seatStatus) {
        this.seatNo = seatNo;
        this.seatStatus = seatStatus;
    }


    abstract void setSeat();
    abstract void setRate();
}
