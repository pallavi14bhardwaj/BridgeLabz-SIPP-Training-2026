package TwoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoadBalancing {

    // Scenario 2: Triplets — Load Balancing Across Three Servers
    public static List<List<Integer>> findTriplets(int[] jobs, int target) {
        Arrays.sort(jobs);
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < jobs.length - 2; i++) {
            if (i > 0 && jobs[i] == jobs[i - 1]) continue;
            
            int left = i + 1, right = jobs.length - 1;
            while (left < right) {
                int sum = jobs[i] + jobs[left] + jobs[right];
                
                if (sum == target) {
                    result.add(Arrays.asList(jobs[i], jobs[left], jobs[right]));
                    while (left < right && jobs[left] == jobs[left + 1]) left++;
                    while (left < right && jobs[right] == jobs[right - 1]) right--;
                    left++; 
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] jobs = {300, 400, 200, 500, 100, 600, 300};
        int target = 900;
        
        System.out.println("Finding job triplets that fill exactly " + target + " ms:");
        List<List<Integer>> triplets = findTriplets(jobs, target);
        System.out.println("Valid triplets: " + triplets);
    }
}
