package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BroadcastAnnouncement {

    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    // spread the message down the management chain one level at a time
    public static List<List<Integer>> broadcastByLevel(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        
        // queue naturally tracks who is next in line to be processed
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            // lock in how many people are in the current layer
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
            
            // process exactly that many people before considering the next layer
            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                level.add(node.val);
                
                // add their direct reports to the back of the line for the next round
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            
            result.add(level); // save this entire layer
        }
        
        return result;
    }

    public static void main(String[] args) {
        // CEO (100)
        // VP1 (200), VP2 (300)
        // Dir1 (400), Dir2 (500)
        Node root = new Node(100);
        root.left = new Node(200);
        root.right = new Node(300);
        root.left.left = new Node(400);
        root.right.right = new Node(500);
        
        System.out.println("Broadcast layers: " + broadcastByLevel(root));
    }
}
