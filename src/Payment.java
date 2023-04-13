abstract class Payment {

    double price;

    public Payment(double price) {
        this.price = price;
    }

    abstract boolean makePayment();

}
