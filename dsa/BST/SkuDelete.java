package BST;

public class SkuDelete {

    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    // permanently discontinues a SKU from the catalog index
    public static Node delete(Node node, int sku) {
        if (node == null) return null;
        
        // hunt for the node first
        if (sku < node.val) {
            node.left = delete(node.left, sku);
        } else if (sku > node.val) {
            node.right = delete(node.right, sku);
        } else {
            // found it! now we handle the 3 cases
            
            // case 1: leaf node (no children)
            if (node.left == null && node.right == null) return null;
            
            // case 2: exactly one child
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            
            // case 3: two children
            // grab the smallest element from the right subtree to take its place
            Node successor = node.right;
            while (successor.left != null) {
                successor = successor.left;
            }
            
            // overwrite the current node with the successor's data
            node.val = successor.val;
            
            // recursively delete the original successor node
            node.right = delete(node.right, successor.val);
        }
        
        return node;
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.right = new Node(40);
        
        System.out.print("Catalog before deleting 30: ");
        inorder(root);
        System.out.println();
        
        root = delete(root, 30);
        
        System.out.print("Catalog after deleting 30: ");
        inorder(root);
        System.out.println();
    }
}
