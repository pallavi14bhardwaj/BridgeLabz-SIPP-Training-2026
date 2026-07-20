package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequentErrorCode {
    // finds the error code that happened the most often in a single pass
    public static int mostFrequentErrorCode(int[] codes) {
        Map<Integer, Integer> freq = new HashMap<>();
        int bestCode = codes[0];
        int bestCount = 0;
        
        for (int code : codes) {
            // merge safely increments the count or starts it at 1
            int count = freq.merge(code, 1, Integer::sum);
            
            // if this code just beat the old record, update our winner
            if (count > bestCount) {
                bestCount = count;
                bestCode = code;
            }
        }
        
        return bestCode;
    }

    public static void main(String[] args) {
        int[] errorCodes = {404, 500, 404, 403, 500, 500, 200};
        System.out.println("Most frequent error code is: " + mostFrequentErrorCode(errorCodes));
    }
}
