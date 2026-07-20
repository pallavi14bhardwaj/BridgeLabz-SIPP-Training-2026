package Stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextHigherTraffic {

    // finds the next day with strictly more visitors for each day
    public static int[] nextBusierDay(int[] visitors) {
        int n = visitors.length;
        int[] answer = new int[n];
        
        // default everything to -1 if we never find a better day
        Arrays.fill(answer, -1);
        
        // stack stores indices, keeping values in decreasing order
        Deque<Integer> stack = new ArrayDeque<>(); 
        
        for (int i = 0; i < n; i++) {
            // while current day has more traffic than the day at the top of the stack
            while (!stack.isEmpty() && visitors[i] > visitors[stack.peek()]) {
                // we found the answer for the day at stack.peek()!
                answer[stack.pop()] = visitors[i];
            }
            // push current day onto the stack to wait for its own better day
            stack.push(i);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int[] traffic = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = nextBusierDay(traffic);
        
        System.out.println("Daily traffic: " + Arrays.toString(traffic));
        System.out.println("Next higher:   " + Arrays.toString(result));
    }
}
