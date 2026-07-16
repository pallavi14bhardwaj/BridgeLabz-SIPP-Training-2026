package LinkedList;

public class TaskQueue {

    static class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    // removes a specific completed task by ID
    public static Node removeTask(Node head, int taskId) {
        if (head == null) return null;
        
        // if the very first task is the one we want, just skip over it
        if (head.val == taskId) return head.next; 
        
        Node prev = head;
        Node curr = head.next;
        
        // hunt for the task
        while (curr != null && curr.val != taskId) {
            prev = curr;
            curr = curr.next;
        }
        
        // if we found it, bypass the current node
        if (curr != null) {
            prev.next = curr.next;
        }
        
        return head;
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
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        System.out.println("Task Queue before removing task 3:");
        printQueue(head);
        
        head = removeTask(head, 3);
        System.out.println("Task Queue after removing task 3:");
        printQueue(head);
    }
}
