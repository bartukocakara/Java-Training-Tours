import java.util.Scanner;

public class LeapYearTest
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = input.nextInt();

        while (year != 0 )
        {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) )
            {
                System.out.printf("%d is a leap year.\n", year);
            }
            else {
                System.out.printf("%d is not a leap year .\n", year);
            }
            System.out.print("Enter another year, or zero to quit : ");
            year = input.nextInt();
        }

        System.out.println("Finish");


    }
}
