public class LinkedList {
    private Node head;
    private int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    LinkedList() {
        head = null;
        size = 1;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            size++;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void addhead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void add(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("index out of range");
            return;
        }
        if (index == 0) {
            addhead(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    public void deletehead() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            size--;
        }
    }

    public void deleteend() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            size--;
        }
    }

    public void delete(int index) {
        if (head == null) {
            System.out.println("List is empty");
        }
        if (index == 0) {
            deletehead();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public void size() {
        System.out.println(size);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);
        list.display();
        System.out.println();
        list.addhead(5);
        list.display();
        System.out.println();
        list.add(2, 25);
        list.display();
        System.out.println();
        list.deletehead();
        list.display();
        System.out.println();
        list.deleteend();
        list.display();
        System.out.println();
        list.delete(2);
        list.display();
        System.out.println();
        list.size();
    }
}
