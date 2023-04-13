public class Silver extends Seat{

    double rate;

    public Silver(String seatNo, boolean seatStatus) {
        super(seatNo, seatStatus);
    }

    @Override
    void setSeat() {
    }


    @Override
    void setRate() {
        this.rate=100;
    }
}
