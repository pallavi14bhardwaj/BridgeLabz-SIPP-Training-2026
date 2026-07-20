package TwoPointersAndSlidingWindow;

public class CpuSpikeDetection {

    // Scenario 3: Fixed Window — Server CPU Spike Detection
    public static int maxSubarrayOfSizeK(int[] cpuLoad, int k) {
        int windowSum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0;
        
        for (int end = 0; end < cpuLoad.length; end++) {
            windowSum += cpuLoad[end];
            
            // Wait until we hit the window size
            if (end >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= cpuLoad[start];
                start++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] cpuReadings = {10, 20, 50, 60, 10, 5, 80, 20, 10};
        int windowSize = 3;
        
        System.out.println("Max CPU load in a window of size " + windowSize + " is: " + 
                           maxSubarrayOfSizeK(cpuReadings, windowSize));
    }
}
