package LinkedList;

public class LogStreamMerger {

    static class Node {
        int val; // represents timestamp
        Node next;
        Node(int val) { this.val = val; }
    }

    // stitches two sorted streams together seamlessly
    public static Node mergeLogStreams(Node a, Node b) {
        // dummy node saves us from annoying edge cases at the very start
        Node dummy = new Node(0);
        Node tail = dummy;
        
        while (a != null && b != null) {
            // grab whoever has the older timestamp
            if (a.val <= b.val) {
                tail.next = a; 
                a = a.next;
            } else {
                tail.next = b; 
                b = b.next;
            }
            tail = tail.next;
        }
        
        // just slap on whatever is left over from either list
        tail.next = (a != null) ? a : b;
        
        return dummy.next; // skip the dummy node
    }

    public static void printStream(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Stream A: 1 -> 4 -> 5
        Node a = new Node(1);
        a.next = new Node(4);
        a.next.next = new Node(5);
        
        // Stream B: 2 -> 3 -> 6
        Node b = new Node(2);
        b.next = new Node(3);
        b.next.next = new Node(6);
        
        System.out.println("Log Stream A:");
        printStream(a);
        
        System.out.println("Log Stream B:");
        printStream(b);
        
        Node merged = mergeLogStreams(a, b);
        System.out.println("Combined Chronological Stream:");
        printStream(merged);
    }
}
