import java.util.Scanner;

public class ClassifyNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer:  ");
        int number = input.nextInt();

        if (number %2 == 0)
        {
            System.out.println(number + " is even");
        }

        if (number %7 == 0)
        {
            System.out.println(number + " is multiple seven");
        }
    }

}
