package Stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ServerLoadSpan {

    // computes how many consecutive prior readings were <= the current one
    public static int[] loadSpan(int[] load) {
        int n = load.length;
        int[] span = new int[n];
        
        // Stack stores indices. Values represented by indices are strictly decreasing
        Deque<Integer> stack = new ArrayDeque<>(); 
        
        for (int i = 0; i < n; i++) {
            // pop all elements smaller than or equal to current load
            while (!stack.isEmpty() && load[stack.peek()] <= load[i]) {
                stack.pop();
            }
            
            // if stack is empty, this load is the highest we've seen so far!
            // Otherwise, it's just higher than everything up to the new top of stack
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            
            stack.push(i);
        }
        
        return span;
    }

    public static void main(String[] args) {
        int[] serverLoads = {10, 4, 5, 90, 120, 80};
        int[] spans = loadSpan(serverLoads);
        
        System.out.println("Server Loads: " + Arrays.toString(serverLoads));
        System.out.println("Load Spans:   " + Arrays.toString(spans));
    }
}
