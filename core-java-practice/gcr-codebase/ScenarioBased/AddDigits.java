package ScenarioBased;

public class AddDigits {

    static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }

        return (num % 10) + sumOfDigits(num / 10);
    }

    static int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        return addDigits(sumOfDigits(num));
    }

    public static void main(String[] args) {
        int num1 = 38;
        int num2 = 0;

        System.out.println(addDigits(num1));
        System.out.println(addDigits(num2));
    }
}
