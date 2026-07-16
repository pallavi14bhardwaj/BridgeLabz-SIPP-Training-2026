package Hashing;

import java.util.HashSet;
import java.util.Set;

public class ConsecutiveUserIDs {
    // finds the longest uninterrupted streak of numbers in random order
    public static int longestConsecutiveRun(int[] ids) {
        Set<Integer> idSet = new HashSet<>();
        for (int id : ids) {
            idSet.add(id);
        }
        
        int longest = 0;
        
        for (int id : idSet) {
            // only start counting if this is the true beginning of a run
            if (!idSet.contains(id - 1)) { 
                int length = 1;
                int current = id;
                
                // keep counting upward as long as the next number exists
                while (idSet.contains(current + 1)) {
                    current++;
                    length++;
                }
                
                longest = Math.max(longest, length);
            }
        }
        
        return longest;
    }

    public static void main(String[] args) {
        int[] userIds = {100, 4, 200, 1, 3, 2}; // 1,2,3,4 is the longest run
        System.out.println("Longest streak of consecutive user IDs: " + longestConsecutiveRun(userIds));
    }
}
