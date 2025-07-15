import java.util.Scanner;

public class fruitshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fruit name: ");
        String fruit = sc.next().toLowerCase();

        System.out.print("Enter quantity (kg): ");
        double qty = sc.nextDouble();

        double price = 0;

        if (fruit.equals("apple")) {
            price = 100;
        } else if (fruit.equals("banana")) {
            price = 40;
        } else if (fruit.equals("mango")) {
            price = 60;
        } else if (fruit.equals("orange")) {
            price = 80;
        } else {
            System.out.println("Error: Unknown fruit.");
            return;
        }

        double total = price * qty;
        double discount = 0;

        if (total > 1000) {
            discount = 0.15;
        } else if (total > 500) {
            discount = 0.10;
        }

        double finalAmount = total - (total * discount);

        System.out.println("Total before discount: ₹" + total);
        System.out.println("Discount applied: " + (int)(discount * 100) + "%");
        System.out.println("Final Amount to Pay: ₹" + finalAmount);
    }
}
