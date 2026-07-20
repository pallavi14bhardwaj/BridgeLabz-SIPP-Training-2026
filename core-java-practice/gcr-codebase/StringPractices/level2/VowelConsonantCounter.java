package StringPractices.level2;

import java.util.Scanner;

class VowelConsonantCounter {

    // checking what type of character it is
    public static String checkCharType(char ch) {
        // converting to lowercase using ASCII if it's uppercase
        if (ch >= 65 && ch <= 90) {
            ch = (char)(ch + 32);
        }
        // now check if it's even a letter
        if (ch < 97 || ch > 122) {
            return "Not a Letter";
        }
        // checking vowels
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        return "Consonant";
    }

    // counting vowels and consonants and returning in array
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            String type = checkCharType(text.charAt(i));
            if (type.equals("Vowel")) vowels++;
            else if (type.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        int[] counts = countVowelsConsonants(text);

        System.out.println("Vowels:     " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }
}