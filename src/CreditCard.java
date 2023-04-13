import java.util.Scanner;

public class CreditCard extends Payment{

    public CreditCard(double price) {
        super(price);
    }

    @Override
    boolean makePayment() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter credit card information
        System.out.print("Enter credit card number: ");
        String cardNumber = scanner.nextLine();
        System.out.print("Enter expiration date (MM/YY): ");
        String expirationDate = scanner.nextLine();
        System.out.print("Enter CVV: ");
        String cvv = scanner.nextLine();

        // Validate credit card information
        boolean isValid = validateCreditCardInfo(cardNumber, expirationDate, cvv);

        scanner.close();

        if (isValid) {
            System.out.println("Payment successful!");
            return true;
        } else {
            System.out.println("Payment unsuccessful. Invalid credit card information.");
            return false;
        }
    }
    private boolean validateCreditCardInfo(String cardNumber, String expirationDate, String cvv) {
        // This method should check if the credit card information is valid and return true or false accordingly.
        // For the purposes of this example, we will assume that all credit card information is valid.
        return true;
    }
}
