import javax.rmi.ssl.SslRMIClientSocketFactory;
import javax.swing.*;

public class Temperatures1 {

    public static void main(String[] args) {
        double[] temperatures = new double[7];

        temperatures[0] = 27.2;
        temperatures[1] = 20.0;
        temperatures[2] = 20.4;
        temperatures[3] = 21.4;
        temperatures[4] = 28.23;
        temperatures[5] = 27.2;
        temperatures[6] = 20.2;

        double sum = 0;

        for (int index = 0; index < temperatures.length; index++)
        {
            sum = sum + temperatures[index];
            index++;
        }
        double average = sum / temperatures.length;

        int nAbove = 0;

        for(int index = 0; index < temperatures.length; index++)
        {
            if (temperatures[index] > average)
            {
                nAbove++;
            }
        }

        System.out.printf("Average temperature for %d days is %.1fC .\n", temperatures.length, average);
        System.out.printf("# days above average: %d\n", nAbove);
        System.out.printf("# days at or below average: %d\n", temperatures.length - nAbove);
    }
}
