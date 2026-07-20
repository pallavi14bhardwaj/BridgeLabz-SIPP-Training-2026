package Stacks;

public class UndoBuffer {
    private String[] data;
    private int top;

    public UndoBuffer(int maxDepth) {
        data = new String[maxDepth];
        top = -1;
    }

    // push a new edit onto the stack
    public boolean push(String edit) {
        // Stop if we hit the capacity limit
        if (top == data.length - 1) {
            System.out.println("Buffer full! Rejecting: " + edit);
            return false;
        }
        data[++top] = edit;
        return true;
    }

    // pop the most recent edit off
    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Nothing left to undo!");
        }
        return data[top--];
    }
    
    // see the most recent edit without undoing it
    public String peek() {
        if (isEmpty()) return null;
        return data[top];
    }

    // check if it's empty
    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        UndoBuffer buffer = new UndoBuffer(3);
        buffer.push("Typing 'hello'");
        buffer.push("Typing ' world'");
        buffer.push("Deleting 'd'");
        
        // This one should be rejected because capacity is 3
        buffer.push("Formatting text");
        
        System.out.println("Most recent edit: " + buffer.peek());
        System.out.println("Undoing: " + buffer.pop());
        System.out.println("Undoing: " + buffer.pop());
    }
}
