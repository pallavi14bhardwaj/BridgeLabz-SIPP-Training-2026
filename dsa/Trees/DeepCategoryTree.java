package Trees;

public class DeepCategoryTree {

    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    // calculates the maximum depth (height) of the tree
    public static int height(Node node) {
        // an empty subtree contributes -1 (so a single leaf node has height 0)
        if (node == null) return -1;
        
        // the height is 1 more than whichever side is deeper
        return Math.max(height(node.left), height(node.right)) + 1;
    }
    
    // flags if the tree breaches our safe UI limits
    public static boolean isTooDeep(Node root, int threshold) {
        return height(root) > threshold;
    }

    public static void main(String[] args) {
        Node root = new Node(1); // Electronics
        root.left = new Node(2); // Computers
        root.left.left = new Node(3); // Laptops
        root.left.left.left = new Node(4); // Gaming Laptops
        
        int threshold = 2; // max height allowed
        
        System.out.println("Tree height is: " + height(root));
        System.out.println("Is the category tree too deep? " + isTooDeep(root, threshold));
    }
}
