package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FraudPair {
    // spots two unsorted transactions that perfectly hit a target
    public static int[] findFraudPair(int[] amounts, int target) {
        // maps amount -> index
        Map<Integer, Integer> seen = new HashMap<>(); 
        
        for (int i = 0; i < amounts.length; i++) {
            int complement = target - amounts[i];
            
            // check if we already saw the exact missing piece
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            
            // save this amount and its index for later
            seen.put(amounts[i], i);
        }
        
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] txns = {12000, 45000, 15000, 34999};
        int target = 49999;
        
        int[] pairIndices = findFraudPair(txns, target);
        System.out.println("Fraud pair indices: " + Arrays.toString(pairIndices));
    }
}
