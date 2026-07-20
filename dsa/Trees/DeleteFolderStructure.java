package Trees;

public class DeleteFolderStructure {

    static class Node {
        String name;
        Node left, right;
        Node(String name) { this.name = name; }
    }

    // safely deletes a folder and everything inside it using postorder traversal
    public static void deleteFolderTree(Node node) {
        if (node == null) return;
        
        // destroy the left contents first
        deleteFolderTree(node.left);
        
        // destroy the right contents next
        deleteFolderTree(node.right);
        
        // safe to destroy the current folder now!
        deleteNode(node); 
    }
    
    // mock method for the actual deletion logic
    private static void deleteNode(Node node) {
        System.out.println("Deleted folder/file: " + node.name);
    }

    public static void main(String[] args) {
        Node root = new Node("root_dir");
        root.left = new Node("documents");
        root.right = new Node("pictures");
        root.left.left = new Node("taxes.pdf");
        root.right.left = new Node("vacation.png");
        
        System.out.println("Starting recursive deletion...");
        deleteFolderTree(root);
        System.out.println("Deletion complete!");
    }
}
