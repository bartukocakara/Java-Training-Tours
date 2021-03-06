import java.util.Scanner;

public class Invoice
{
    public static void main(String[] args) {
        final double TAX_RATE = 0.07;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter item price : $");
        double price = input.nextDouble();
        System.out.print("Enter quantity : ");
        int quantity = input.nextInt();

        if (price  > 0 && quantity > 0)
        {
                double subtotal = quantity*price;
                double tax = subtotal * TAX_RATE;
                double total = subtotal * tax;
                System.out.format("Subtotal: $%8.2f\n", subtotal);
                System.out.format("Tax:      $%8.2f\n", tax);
                System.out.format("Total:    $%8.2f\n", total);

        }
        else
        {
            System.out.println("Price or quantity must be greater than zero");
        }

    }
}
