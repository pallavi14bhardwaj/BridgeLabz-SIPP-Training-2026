package StringPractices.level1;

class NullPointerDemo {

    // this will crash the program because text is null
    public static void generateException() {
        String text = null;
        // calling length() on null will throw NullPointerException
        System.out.println(text.length());
    }

    // same situation but handled properly with try-catch
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException => " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception => " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // first calling without handling - program stops abruptly
        // generateException();

        // now calling the safe version
        handleException();
    }
}