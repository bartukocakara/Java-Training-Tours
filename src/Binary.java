import java.util.Scanner;

public class Binary {

    public static int binarySearch(String[] data, String value){
        int low = 0;
        int high = data.length -1;
        while(high >= low) {
            int mid = (high + low) / 2;
            if(data[mid].equals(value)){
                return mid;
            }
            else if(value.compareTo((data[mid])) < 0)
            {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -low -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] countries = {"AT", "AU", "ES", "FR", "HU",
                            "IS", "JP", "PT"};
        String value = "";
        do{
            System.out.print("Enter country code to find, or press ENTER to quit : ");
            value = input.nextLine();
            value = value.toUpperCase();
            if(!value.equals("")){
                int foundAt = binarySearch(countries, value);
                System.out.printf("%s found at index %d\n", value, foundAt);
            }
        }while(!value.equals(""));
    }
}
