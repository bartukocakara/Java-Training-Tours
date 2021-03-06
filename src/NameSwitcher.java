import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NameSwitcher {
    public static void main(String[] args) {
        File inFile = new File("people.txt");
        File outFile = new File("switched_people.txt");

        try {
            Scanner input = new Scanner(inFile);
            PrintWriter output = new PrintWriter(outFile);

            while (input.hasNext()){
                String line = input.nextLine();
                String[] nameParts = line.split(" ");
                String newName = nameParts[1] + ", " + nameParts[0];
                output.write(newName + "\n");
            }
            input.close();
            output.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
