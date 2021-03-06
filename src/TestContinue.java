import java.awt.*;
import java.util.Scanner;

public class TestContinue
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 0;

        while (number < 10){
            number++;
            if(number == 7 || number == 8) {
                continue;
            }
            sum += number;
            System.out.printf("Number : %d sum %d\n", number, sum);
        }
        System.out.println("The sum is" + sum);
    }
}
