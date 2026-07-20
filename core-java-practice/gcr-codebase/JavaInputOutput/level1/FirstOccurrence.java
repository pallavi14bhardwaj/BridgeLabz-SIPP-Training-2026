package JavaInputOutput.level1;
import java.util.Scanner;

public class FirstOccurrence {

    public static int findIndex(String text, String word) {

        return text.indexOf(word);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String text = sc.nextLine();

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        int index = findIndex(text, word);

        System.out.println("Index = " + index);

        sc.close();
    }
}