/* Day 06 - Problem Solving for the day - 08.07.2025

The unit wraps chocolates and places them into a conveyor belt queue modeled using a singly linked list.

1. Chocolates produced manually by workers are added at the beginning of the conveyor belt.

2. Chocolates produced by machines are added at the end of the conveyor belt.

You need to create a singly linked list structure to support:

 - Insert at beginning (manual chocolate addition).

 - Insert at end (machine chocolate addition).

A function to display all chocolates in the current belt order.

InsertAtEnd("DairyMilk")     // Machine added
InsertAtBeginning("Perk")    // Worker added
InsertAtEnd("KitKat")        // Machine added
InsertAtBeginning("5Star")   // Worker added

Display() - Display Details  */

public class pltDaySix {
    
    static class Node {
        String chocolate;
        Node next;

        Node(String chocolate) {
            this.chocolate = chocolate;
            this.next = null;
        }
    }

    static class ConveyorBelt {
        Node head;

        // Insert at beginning
        public void insertAtBeginning(String chocolate) {
            Node newNode = new Node(chocolate);
            newNode.next = head;
            head = newNode;
        }

        // Insert at end
        public void insertAtEnd(String chocolate) {
            Node newNode = new Node(chocolate);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Display chocolates
        public void display() {
            Node current = head;
            if (current == null) {
                System.out.println("No chocolates in the conveyor belt.");
                return;
            }
            System.out.print("Chocolates in the conveyor belt: ");
            while (current != null) {
                System.out.print(current.chocolate + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ConveyorBelt conveyorBelt = new ConveyorBelt();

        conveyorBelt.insertAtEnd("DairyMilk");     // Machine added
        conveyorBelt.insertAtBeginning("Perk");    // Worker added
        conveyorBelt.insertAtEnd("KitKat");        // Machine added
        conveyorBelt.insertAtBeginning("5Star");   // Worker added

        conveyorBelt.display(); // Display Details
    }

}
