package LinkedList;

public class RelayChain {

    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    // finds the exact midpoint server without pre-counting
    public static Node findMiddleServer(Node head) {
        Node slow = head;
        Node fast = head;
        
        // fast pointer sprints at double speed
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // when fast hits the end, slow is exactly in the middle!
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        
        Node mid = findMiddleServer(head);
        System.out.println("The middle server ID is: " + mid.val);
    }
}
