package JavaInputOutput.level1;
import java.util.Scanner;
import java.util.Stack;

public class SimplifyPath {

    public static String simplify(String path) {

        Stack<String> stack = new Stack<>();

        String[] folders = path.split("/");

        for (String folder : folders) {

            if (folder.equals("") || folder.equals(".")) {
                continue;
            }

            if (folder.equals("..")) {

                if (!stack.isEmpty()) {
                    stack.pop();
                }

            } else {
                stack.push(folder);
            }
        }

        String result = "";

        for (String folder : stack) {
            result += "/" + folder;
        }

        if (result.equals("")) {
            return "/";
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter path: ");
        String path = sc.nextLine();

        System.out.println("Simplified Path = " + simplify(path));

        sc.close();
    }
}