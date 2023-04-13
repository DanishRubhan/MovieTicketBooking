import java.util.List;

public class Customer extends Person{
    List<Booking> bookings;


    public Customer(String name, String address, String emailId, String phoneNumber) {
        super(name, address, emailId, phoneNumber);
    }

    public void createBooking(Booking booking) {
        boolean paymentSuccessful = booking.payment.makePayment();
        if (paymentSuccessful) {
            this.bookings.add(booking);
            System.out.println("Booking created successfully.");
        } else {
            System.out.println("Payment unsuccessful. Booking not created.");
        }
    }

    public void deleteBooking(Booking booking) {
        this.bookings.remove(booking);
        booking.showTime.updateSeatStatus((List<Seat>) booking.seat);
        System.out.println("Booking deleted successfully.");
    }
}
