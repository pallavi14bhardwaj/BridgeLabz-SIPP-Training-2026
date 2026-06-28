package ScenarioBased;
class Sensor {

    public boolean increasing(int[] arr, int index) {

        // Base case
        if (index == arr.length - 1) {
            return true;
        }

        // If current element is greater than next, not increasing
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Check next pair
        return increasing(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {10, 11, 12, 13, 14};

        Sensor s = new Sensor();

        boolean ans = s.increasing(arr, 0);

        System.out.println(ans);
    }
}