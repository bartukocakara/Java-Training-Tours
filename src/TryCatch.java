import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean valid = false;
        int years = 0;
        while(!valid) {
            try{
                System.out.print("How many years old are you?");
                years = input.nextInt();
                if(years > 0) {
                    valid = true;
                } else {
                    System.out.println("Age must be created");
                }
            } catch (InputMismatchException ex) {
                input.nextLine();
                System.out.println("Please use digits only");
            }

        }
        int days = years * 365;
        System.out.printf("You are about %d days old .\n", days);
    }
}
