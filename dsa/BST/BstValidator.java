package BST;

public class BstValidator {

    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    // audits the entire tree to make sure it's a true BST
    public static boolean isValidBST(Node root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    // checks that every node fits perfectly within its inherited boundaries
    private static boolean validate(Node node, long min, long max) {
        if (node == null) return true;
        
        // if this node breaches the rules, the whole tree is corrupt
        if (node.val <= min || node.val >= max) return false;
        
        // left child max becomes current node's value. right child min becomes current node's value.
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }

    public static void main(String[] args) {
        Node goodTree = new Node(10);
        goodTree.left = new Node(5);
        goodTree.right = new Node(15);
        
        Node badTree = new Node(10);
        badTree.left = new Node(5);
        badTree.right = new Node(15);
        // this 6 is on the right side of 10, which makes it corrupt!
        badTree.right.left = new Node(6); 
        
        System.out.println("Is goodTree valid? " + isValidBST(goodTree));
        System.out.println("Is badTree valid? " + isValidBST(badTree));
    }
}
