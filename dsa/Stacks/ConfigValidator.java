package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ConfigValidator {

    // Validates if the configuration string has properly nested brackets
    public static boolean isValidConfig(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        
        // setup our matching rules
        Map<Character, Character> matchFor = Map.of(')', '(', ']', '[', '}', '{');
        
        for (char c : s.toCharArray()) {
            // if it's an opening bracket, toss it on the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (matchFor.containsKey(c)) {
                // it's a closing bracket, check if it matches the top of the stack
                if (stack.isEmpty() || stack.pop() != matchFor.get(c)) {
                    return false; // mismatch found!
                }
            }
        }
        
        // if stack is empty, everything matched perfectly!
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String validConfig = "{ server: [ { port: 80 } ] }";
        String invalidConfig = "{ server: [ { port: 80 ] } }"; // notice the mismatch bracket
        
        System.out.println("Is validConfig valid? " + isValidConfig(validConfig));
        System.out.println("Is invalidConfig valid? " + isValidConfig(invalidConfig));
    }
}
