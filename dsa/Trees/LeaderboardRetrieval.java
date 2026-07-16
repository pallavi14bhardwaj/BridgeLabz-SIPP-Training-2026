package Trees;

import java.util.ArrayList;
import java.util.List;

public class LeaderboardRetrieval {
    
    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    // helper function that actually does the recursive inorder walk
    private static void inorder(Node node, List<Integer> result) {
        // base case: if there's no node here, just turn back
        if (node == null) return;
        
        // step 1: go as far left as possible (smallest values)
        inorder(node.left, result);
        
        // step 2: record the current node
        result.add(node.val);
        
        // step 3: explore the right side (larger values)
        inorder(node.right, result);
    }

    // get the fully sorted leaderboard directly from the BST
    public static List<Integer> getSortedLeaderboard(Node root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public static void main(String[] args) {
        // creating a simple BST: 
        //       50
        //     /    \
        //   30      70
        //  /  \    /  \
        // 20  40  60  80
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        
        List<Integer> sortedScores = getSortedLeaderboard(root);
        System.out.println("Leaderboard Scores: " + sortedScores);
    }
}
