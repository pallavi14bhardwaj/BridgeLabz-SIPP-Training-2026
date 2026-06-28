package ScenarioBased;

public class powerOftwo {

    static boolean isPowerOfTwo(int n) {


        if (n < 1) {
            return false;
        }

        if (n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }

        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 16;
        int n3 = 3;

        System.out.println(isPowerOfTwo(n1));
        System.out.println(isPowerOfTwo(n2));
        System.out.println(isPowerOfTwo(n3));
    }
}