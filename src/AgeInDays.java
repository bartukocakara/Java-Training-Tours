import java.util.Scanner;

public class AgeInDays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age:");
        int years = input.nextInt();

        if(years > 0)
        {
            int days = years * 365;
            System.out.format("%d years is about %d days .\n", years, days);
        }
        else
        {
            System.out.print("Eksilerde rakam seçemezsiniz");
        }

    }
}
