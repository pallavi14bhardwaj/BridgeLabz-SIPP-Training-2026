package Hashing;

import java.util.HashSet;
import java.util.Set;

public class DuplicateToken {
    // quickly checks if any session token was issued twice
    public static boolean hasDuplicateToken(String[] tokens) {
        Set<String> seen = new HashSet<>();
        
        for (String token : tokens) {
            // add() returns false if the set already had it
            if (!seen.add(token)) { 
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] logs = {"tokenA", "tokenB", "tokenC", "tokenA"};
        System.out.println("Has duplicate token? " + hasDuplicateToken(logs));
    }
}
