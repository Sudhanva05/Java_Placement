package Stack;

public class Stack {
    // Node class (inner class for Linked List)
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;  // top of stack

    Stack() {
        top = null;
    }

    // Push element
    void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
        System.out.println(val + " pushed to stack");
    }

    // Pop element
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(top.data + " popped from stack");
        top = top.next;
    }

    // Peek top
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Check if empty
    boolean isEmpty() {
        return top == null;
    }

    // Display stack
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // ===== Main function inside same file =====
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();

        System.out.println("Top element: " + s.peek());

        s.pop();
        s.display();

        s.pop();
        s.pop();
        s.pop(); // Underflow
    }
}
