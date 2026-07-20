package Trees;

public class CommunicationPath {

    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    // instance variable to track the max diameter across all recursive calls
    private int diameter = 0;

    // finds the longest possible communication path anywhere in the org
    public int longestCommunicationPath(Node root) {
        diameter = 0; // reset for safety
        heightAndUpdateDiameter(root);
        return diameter;
    }
    
    // sneaky method that computes height but ALSO updates the global diameter on the fly
    private int heightAndUpdateDiameter(Node node) {
        if (node == null) return -1;
        
        int leftHeight = heightAndUpdateDiameter(node.left);
        int rightHeight = heightAndUpdateDiameter(node.right);
        
        // update the best diameter found so far (path passing through current node)
        diameter = Math.max(diameter, leftHeight + rightHeight + 2);
        
        // return the standard height for the parent to use
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        CommunicationPath pathFinder = new CommunicationPath();
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        System.out.println("Longest internal communication path length: " + 
                           pathFinder.longestCommunicationPath(root));
    }
}
