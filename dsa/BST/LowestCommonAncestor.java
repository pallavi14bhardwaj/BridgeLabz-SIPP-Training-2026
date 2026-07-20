package BST;

public class LowestCommonAncestor {

    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    // finds the narrowest shared access control level
    public static Node lowestCommonAncestor(Node root, int p, int q) {
        Node current = root;
        
        while (current != null) {
            // if both targets are smaller, the LCA must be down the left path
            if (p < current.val && q < current.val) {
                current = current.left;
            } 
            // if both are bigger, it must be down the right path
            else if (p > current.val && q > current.val) {
                current = current.right;
            } 
            // if they split (or one equals current), this is our common ancestor!
            else {
                return current;
            }
        }
        
        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(10);
        root.left.right = new Node(40);
        
        Node lca = lowestCommonAncestor(root, 10, 40);
        System.out.println("Lowest common ancestor of 10 and 40 is: " + lca.val);
    }
}
