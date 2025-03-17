class Stack {
    Node Head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void push(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
        } else {
            newNode.next = Head;
            Head = newNode;
            System.out.println("Pushed Element: " + newNode.data);
        }
    }

    void pop() {
        if (Head == null) {
            System.out.println("Empty Stack");
        } else {
            System.out.println("Popped Element: " + Head.data);
            Head = Head.next;
        }
    }

    void peek() {
        if (Head == null) {
            System.out.println("Empty Stack");
        } else {
            System.out.println("Peek Element: " + Head.data);
        }
    }

    void display() {
        Node temp = Head;
        if (Head == null) {
            System.out.println("Empty Stack");
        }
        while (!(temp == null)) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
        stack.peek();
    }
}