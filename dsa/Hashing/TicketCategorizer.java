package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketCategorizer {
    // groups support tickets that are anagrams of each other
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        
        for (String s : strs) {
            // sort the characters to build a uniform signature key
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); 
            
            // bucket them together by the sorted key
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        
        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {
        String[] tickets = {"rate limit", "limit rate", "login bug", "bug login", "crash"};
        List<List<String>> grouped = groupAnagrams(tickets);
        
        System.out.println("Grouped Tickets:");
        for (List<String> group : grouped) {
            System.out.println(group);
        }
    }
}
