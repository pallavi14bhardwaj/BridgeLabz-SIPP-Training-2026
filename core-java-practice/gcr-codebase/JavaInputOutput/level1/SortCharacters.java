package JavaInputOutput.level1;
import java.util.HashMap;
import java.util.Scanner;

public class SortCharacters {

    public static String sortByFrequency(String text) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : text.toCharArray()) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        String result = "";

        while (!map.isEmpty()) {

            char maxChar = ' ';
            int maxCount = 0;

            for (char ch : map.keySet()) {

                if (map.get(ch) > maxCount) {
                    maxCount = map.get(ch);
                    maxChar = ch;
                }
            }

            for (int i = 0; i < maxCount; i++) {
                result += maxChar;
            }

            map.remove(maxChar);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.nextLine();

        System.out.println("Output = " + sortByFrequency(text));

        sc.close();
    }
}