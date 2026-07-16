package TwoPointersAndSlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class ApiRateLimiter {

    // Scenario 5: Variable Window — API Rate Limiter Window Adjustment
    public static int longestSubarrayWithAtMostNDistinct(int[] keyIds, int n) {
        Map<Integer, Integer> freq = new HashMap<>();
        int start = 0, maxLen = 0;
        
        for (int end = 0; end < keyIds.length; end++) {
            freq.merge(keyIds[end], 1, Integer::sum);
            
            while (freq.size() > n) {
                int leftKey = keyIds[start];
                freq.put(leftKey, freq.get(leftKey) - 1);
                
                if (freq.get(leftKey) == 0) {
                    freq.remove(leftKey);
                }
                
                start++;
            }
            
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] apiKeysUsed = {1, 2, 1, 3, 2, 4, 1, 1, 1};
        int maxDistinct = 2;
        
        System.out.println("Longest window with at most " + maxDistinct + " distinct API keys:");
        System.out.println("Length: " + longestSubarrayWithAtMostNDistinct(apiKeysUsed, maxDistinct));
    }
}
