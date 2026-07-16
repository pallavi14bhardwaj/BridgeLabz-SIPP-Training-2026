package Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class DeepOrgChart {

    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    // safely export an arbitrarily deep org chart without blowing up the call stack
    public static List<Integer> iterativePreorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        
        // using an explicit stack instead of java's internal call stack
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            result.add(node.val); // visit the manager first!
            
            // push right child FIRST so that the left child ends up on top of it,
            // meaning the left child will be popped and visited next.
            if (node.right != null) stack.push(node.right); 
            if (node.left != null) stack.push(node.left); 
        }
        
        return result;
    }

    public static void main(String[] args) {
        //   1
        //  / \
        // 2   3
        //    / \
        //   4   5
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        
        System.out.println("Org chart export (preorder): " + iterativePreorder(root));
    }
}
