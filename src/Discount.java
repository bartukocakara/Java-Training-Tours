import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the quantity : ");
        int quantity = input.nextInt();
        double price = 15;
        double total = quantity * price;

        if(quantity > 15)
        {
            if (quantity < 50)
            {
                System.out.println("You get an 10% quantity discount");
                total = total * 0.90;
            }

            else
                System.out.println(
                        String.format("Your total price is $%.2f",
                                total));


        }


    }
}
