package JavaInputOutput.level1;
import java.io.*;
import java.util.Scanner;

public class SchoolResultPortal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));

            BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt", true));

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(" ");

                String name = data[0];
                int mark1 = Integer.parseInt(data[1]);
                int mark2 = Integer.parseInt(data[2]);
                int mark3 = Integer.parseInt(data[3]);

                double average = (mark1 + mark2 + mark3) / 3.0;

                bw.write("Name : " + name);
                bw.newLine();
                bw.write("Average : " + average);
                bw.newLine();
                bw.write("-----------------------");
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Report card created successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Student file not found.");

        } catch (IOException e) {
            System.out.println("Error while reading or writing file.");
        }

        sc.close();
    }
}