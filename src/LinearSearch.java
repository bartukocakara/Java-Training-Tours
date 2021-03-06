import java.util.Scanner;

public class LinearSearch {

    public static  int linearSearch(int[] data, int value){
        int position = 0;
        while(position < data.length && data[position] != value)
        {
            position++;
        }
        return ((position < data.length) ? position : -1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = {37, 24, 49, 82, 45};
        int value = 0;

        do{
            System.out.print("Enter number to find, or 0 to quit : ");
            value = input.nextInt();
            if(value != 0) {
                int foundAt = linearSearch(data, value);
                System.out.printf("%d found at index %d \n", value, foundAt);
            }
        }while (value != 0);
    }
}
