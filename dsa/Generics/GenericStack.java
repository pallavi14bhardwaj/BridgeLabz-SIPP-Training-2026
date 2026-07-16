package Generics;

import java.util.ArrayList;
import java.util.List;

// A custom generic stack implementation
public class GenericStack<T> {
    private List<T> elements;

    public GenericStack() {
        elements = new ArrayList<>();
    }

    // Push an element onto the top of the stack
    public void push(T item) {
        elements.add(item);
    }

    // Remove and return the top element
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.remove(elements.size() - 1);
    }

    // Look at the top element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }
    
    @Override
    public String toString() {
        return elements.toString();
    }
}
