package JavaInputOutput.level1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GroceryBillReader {

    public static void main(String[] args) {

        int lineCount = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader("bill.txt"));

            String line;

            System.out.println("Bill Details:");

            while ((line = br.readLine()) != null) {

                System.out.println(line);
                lineCount++;
            }

            br.close();

            System.out.println("Total Lines = " + lineCount);

        } catch (IOException e) {
            System.out.println("Unable to read file.");
        }
    }
}