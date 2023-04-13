import java.util.Scanner;

public class Cash extends  Payment{


    public Cash(double price) {
        super(price);
    }

    @Override
    boolean makePayment() {
        //Functionality

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of cash: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline character
        scanner.close();

        if (amount >= price) {
            System.out.println("Payment successful!");
            return true;
        } else {
            System.out.println("Payment unsuccessful. Amount paid is not enough.");
            return false;
        }
    }
}
