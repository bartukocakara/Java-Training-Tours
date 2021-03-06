import java.util.Scanner;

public class StringComparison
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String str1 = input.nextLine();
        str1 = str1.trim();

        System.out.print("Enter second string : ");
        String str2 = input.nextLine().trim();

        if (str1.compareTo(str2) < 0 )
        {
            System.out.println(str1 + " less than " + str2);
        }
        else if (str1.compareTo(str2) > 0)
        {
            System.out.println(str1 + " is greater than " + str2);
        }
        else{
            System.out.println(str1 + " and " + str2 + " are equal");
        }
    }
}
