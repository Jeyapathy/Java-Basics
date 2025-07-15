class SinglyLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node head;

    void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = newNode;
    }

    void insertAtPosition(int data, int pos) {
        if (pos == 0) {
            insertAtBegin(data);
            return;
        }
        Node newNode = new Node(data);
        Node curr = head;
        for (int i = 0; i < pos - 1 && curr != null; i++)
            curr = curr.next;
        if (curr == null) return;
        newNode.next = curr.next;
        curr.next = newNode;
    }

    void deleteAtBegin() {
        if (head != null) head = head.next;
    }

    void deleteAtEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        while (curr.next.next != null) curr = curr.next;
        curr.next = null;
    }

    void deleteAtPosition(int pos) {
        if (pos == 0) {
            deleteAtBegin();
            return;
        }
        Node curr = head;
        for (int i = 0; i < pos - 1 && curr != null; i++)
            curr = curr.next;
        if (curr == null || curr.next == null) return;
        curr.next = curr.next.next;
    }

    void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(10);
        list.insertAtBegin(5);
        list.insertAtEnd(15);
        list.insertAtPosition(12, 2);
        list.printList(); // 5 10 12 15
        list.deleteAtBegin();
        list.deleteAtEnd();
        list.deleteAtPosition(1);
        list.printList(); // 10
    }
}