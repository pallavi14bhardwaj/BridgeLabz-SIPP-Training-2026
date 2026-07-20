package LinkedList;

public class BrowserHistory {

    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    // flips the entire history chain backwards
    public static Node reverseHistory(Node head) {
        Node prev = null;
        Node curr = head;
        
        while (curr != null) {
            // save the next node before we break the link
            Node next = curr.next;
            
            // turn the pointer around
            curr.next = prev;
            
            // shuffle everyone forward for the next loop iteration
            prev = curr;
            curr = next;
        }
        
        // prev is sitting directly on the new head
        return prev;
    }

    public static void printHistory(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(5); // newest
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1); // oldest
        
        System.out.println("Original History (newest to oldest):");
        printHistory(head);
        
        Node reversed = reverseHistory(head);
        System.out.println("Reversed History (oldest to newest):");
        printHistory(reversed);
    }
}
