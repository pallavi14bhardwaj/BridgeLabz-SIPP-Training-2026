package LinkedList;

public class RedirectLoop {

    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    // catches infinite loops using the tortoise and hare trick
    public static boolean hasRedirectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            // if they crash into each other, we're stuck in a loop
            if (slow == fast) {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        // intentionally forcing a loop back to 2
        head.next.next.next.next = head.next; 
        
        boolean hasLoop = hasRedirectLoop(head);
        System.out.println("Does this redirect chain have an infinite loop? " + hasLoop);
    }
}
