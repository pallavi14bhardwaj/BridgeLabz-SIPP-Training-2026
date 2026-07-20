package RecursionPractice;
import java.util.Scanner;

public class ReverseString {

    // Print string in reverse order
    static void reverse(String str, int index) {

        if (index < 0)
            return;

        System.out.print(str.charAt(index));

        reverse(str, index - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Reverse: ");
        reverse(str, str.length() - 1);

        sc.close();
    }
}