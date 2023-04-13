public class TicketAgent {
    public boolean createBooking(Booking booking) {
        boolean paymentSuccessful = booking.payment.makePayment();
        return paymentSuccessful;
    }
}
