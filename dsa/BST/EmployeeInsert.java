package BST;

public class EmployeeInsert {

    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    // securely onboard a new employee ID into the BST
    public static Node insert(Node node, int id) {
        // found an empty spot! drop the new node here
        if (node == null) {
            return new Node(id);
        }
        
        // traverse down to find the right spot
        if (id < node.val) {
            node.left = insert(node.left, id);
        } else if (id > node.val) {
            node.right = insert(node.right, id);
        }
        
        // return the unchanged node pointer back up the call stack
        return node;
    }

    // helper to verify structure
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(100);
        insert(root, 50);
        insert(root, 150);
        insert(root, 75); // new employee!
        
        System.out.print("Onboarded IDs in order: ");
        inorder(root);
        System.out.println();
    }
}
