package LinkedList;

public class PlaylistQueue {
    
    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    // insert a new track right after the currently playing track
    public static void insertAfter(Node current, int trackId) {
        Node newNode = new Node(trackId);
        
        // grab onto the rest of the queue first so we don't lose it
        newNode.next = current.next; 
        
        // now safely hook the current track up to the new one
        current.next = newNode; 
    }

    public static void printQueue(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);
        
        System.out.println("Original playlist:");
        printQueue(head);
        
        System.out.println("Inserting track 999 after 102...");
        insertAfter(head.next, 999);
        printQueue(head);
    }
}
