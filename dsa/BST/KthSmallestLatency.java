package BST;

import java.util.ArrayDeque;
import java.util.Deque;

public class KthSmallestLatency {

    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    // grabs the kth lowest response time percentile
    public static int kthSmallest(Node root, int k) {
        Deque<Node> stack = new ArrayDeque<>();
        Node current = root;
        int count = 0;
        
        while (current != null || !stack.isEmpty()) {
            // drill down the left side completely
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            // start popping and counting
            current = stack.pop();
            count++;
            
            // stop as soon as we hit k!
            if (count == k) return current.val;
            
            current = current.right;
        }
        
        throw new IllegalArgumentException("k is out of range!");
    }

    public static void main(String[] args) {
        Node root = new Node(100);
        root.left = new Node(50);
        root.right = new Node(200);
        root.left.left = new Node(10);
        root.left.right = new Node(75);
        
        System.out.println("The 2nd fastest response time is: " + kthSmallest(root, 2));
    }
}
