public class Platinum extends Seat{
    double rate;

    public Platinum(String seatNo, boolean seatStatus) {
        super(seatNo, seatStatus);
    }
    @Override
    void setSeat() {

    }


    @Override
    void setRate() {
        this.rate=150;
    }
}
