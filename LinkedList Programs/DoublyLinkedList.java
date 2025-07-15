class DoublyLinkedList {
    static class Node {
        int data;
        Node prev, next;
        Node(int data) { this.data = data; }
    }

    Node head;

    void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) head.prev = newNode;
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
        newNode.prev = curr;
    }

    void insertAtPosition(int data, int pos) {
        if (pos == 0) {
            insertAtBegin(data);
            return;
        }
        Node curr = head;
        for (int i = 0; i < pos - 1 && curr != null; i++)
            curr = curr.next;
        if (curr == null) return;
        Node newNode = new Node(data);
        newNode.next = curr.next;
        newNode.prev = curr;
        if (curr.next != null) curr.next.prev = newNode;
        curr.next = newNode;
    }

    void deleteAtBegin() {
        if (head == null) return;
        head = head.next;
        if (head != null) head.prev = null;
    }

    void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.prev.next = null;
    }

    void deleteAtPosition(int pos) {
        if (pos == 0) {
            deleteAtBegin();
            return;
        }
        Node curr = head;
        for (int i = 0; i < pos && curr != null; i++)
            curr = curr.next;
        if (curr == null) return;
        if (curr.prev != null) curr.prev.next = curr.next;
        if (curr.next != null) curr.next.prev = curr.prev;
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
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtBegin(10);
        list.insertAtEnd(20);
        list.insertAtPosition(15, 1);
        list.printList(); // 10 15 20
        list.deleteAtBegin();
        list.deleteAtEnd();
        list.deleteAtPosition(0);
        list.printList(); // (empty)
    }
}