package Stacks;

public class CallStack {
    
    // nested node class to act as a stack frame
    private static class Frame {
        String functionName;
        Frame next;
        
        Frame(String name, Frame next) {
            this.functionName = name;
            this.next = next;
        }
    }
    
    // the top of our stack
    private Frame top = null;

    // push a new function call
    public void push(String functionName) {
        // point the new frame's next at the old top
        top = new Frame(functionName, top);
    }

    // pop when a function returns
    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("No active call to return from!");
        }
        String name = top.functionName;
        top = top.next;
        return name;
    }

    // peek to see what's currently running
    public String peek() {
        if (isEmpty()) return null;
        return top.functionName;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        CallStack stack = new CallStack();
        stack.push("main()");
        stack.push("calculateSum()");
        stack.push("parseData()");
        
        System.out.println("Currently executing: " + stack.peek());
        System.out.println("Returning from: " + stack.pop());
        System.out.println("Now executing: " + stack.peek());
    }
}
