package Hashing;

import java.util.HashMap;
import java.util.Map;

public class RevenueWindow {
    // counts how many contiguous days total up to exactly k revenue
    public static int subarraySumEqualsK(int[] revenueChanges, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        // we always start with one way to have a sum of zero (doing nothing)
        prefixCount.put(0, 1);
        
        int runningSum = 0;
        int answer = 0;
        
        for (int change : revenueChanges) {
            runningSum += change;
            
            // if we've seen (runningSum - k) before, we have a matching subarray!
            answer += prefixCount.getOrDefault(runningSum - k, 0);
            
            // record this new running sum
            prefixCount.merge(runningSum, 1, Integer::sum);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int[] dailyRevenue = {1, -1, 5, -2, 3};
        int target = 3;
        // Valid ranges here: [5, -2], [3], and [1, -1, 5, -2] (which sums to 3)
        System.out.println("Contiguous periods netting exactly " + target + " revenue: " + 
                           subarraySumEqualsK(dailyRevenue, target));
    }
}
