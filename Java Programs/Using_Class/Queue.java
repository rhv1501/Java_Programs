class Queue {
    private int size;
    private Node front;
    private Node rear;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Empty Queue");
        } else {
            front = front.next;
            size--;
        }
    }

    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void isEmpty() {
        if (front == null) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Not Empty");
        }
    }

    void peek() {
        if (front == null) {
            System.out.println("Empty Queue");
        } else {
            System.out.println(front.data);
        }
    }

    void size() {
        System.out.println(size);
    }

    public static void main(String[] args) {
        Queue Q = new Queue();
        Q.enqueue(10);
        Q.enqueue(20);
        Q.enqueue(30);
        Q.enqueue(40);
        Q.enqueue(50);
        System.out.println("Queue:");
        Q.display();
        System.out.println("Dequeue:");
        Q.dequeue();
        Q.display();
        System.out.println("Peek:");
        Q.peek();
        System.out.println("Size:");
        Q.size();
        System.out.println("Is Empty:");
        Q.isEmpty();
    }
}