package BST;

public class UsernameSearch {

    static class Node {
        int val;
        Node left, right;
        Node(int val) { this.val = val; }
    }

    // quickly finds if a username (represented by an ID) is already taken
    public static boolean search(Node root, int target) {
        Node current = root;
        
        while (current != null) {
            if (target == current.val) return true;
            
            // if target is smaller, go left. if bigger, go right. 
            current = (target < current.val) ? current.left : current.right;
        }
        
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(100);
        root.left = new Node(50);
        root.right = new Node(150);
        
        System.out.println("Is user 50 taken? " + search(root, 50));
        System.out.println("Is user 75 taken? " + search(root, 75));
    }
}
