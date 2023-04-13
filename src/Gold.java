public class Gold extends Seat{
    double rate;

    public Gold(String seatNo, boolean seatStatus) {
        super(seatNo, seatStatus);
    }

    @Override
    void setSeat() {
    }


    @Override
    void setRate() {
        this.rate=80;
    }
}
