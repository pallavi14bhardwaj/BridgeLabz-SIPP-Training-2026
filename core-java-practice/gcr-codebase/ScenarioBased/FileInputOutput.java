package ScenarioBased;

import java.io.FileReader;
import java.io.IOException;

class FileInputOutput {

    public static void main(String[] args) {

        try (FileReader file = new FileReader("demo.txt")) {

            int ch;

            while ((ch = file.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println("File not found or cannot be read.");
        }
    }
}