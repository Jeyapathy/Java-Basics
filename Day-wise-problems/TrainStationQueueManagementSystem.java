import java.util.*;

class Passenger {
    String name;
    int age;
    String ticketType;

    Passenger(String name, int age, String ticketType) {
        this.name = name;
        this.age = age;
        this.ticketType = ticketType;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Ticket: " + ticketType + ")";
    }
}

public class TrainStationQueueManagementSystem {

    static Queue<Passenger> seniorQueue = new LinkedList<>();
    static Queue<Passenger> regularQueue = new LinkedList<>();

    public static void addPassenger(String name, int age, String ticketType) {
        Passenger p = new Passenger(name, age, ticketType);
        if (age >= 60) {
            seniorQueue.add(p);
        } else {
            regularQueue.add(p);
        }
        System.out.println("Passenger added: " + p);
    }

    public static void boardNextPassenger() {
        if (!seniorQueue.isEmpty()) {
            System.out.println("Boarding Senior: " + seniorQueue.poll());
        } else if (!regularQueue.isEmpty()) {
            System.out.println("Boarding Passenger: " + regularQueue.poll());
        } else {
            System.out.println("No passengers to board.");
        }
    }

    public static void displayQueues() {
        System.out.println("\n--- Senior Queue ---");
        if (seniorQueue.isEmpty()) {
            System.out.println("No seniors in queue.");
        } else {
            for (Passenger p : seniorQueue) {
                System.out.println(p);
            }
        }

        System.out.println("\n--- Regular Queue ---");
        if (regularQueue.isEmpty()) {
            System.out.println("No regular passengers in queue.");
        } else {
            for (Passenger p : regularQueue) {
                System.out.println(p);
            }
        }
    }

    public static void checkIfQueuesEmpty() {
        if (seniorQueue.isEmpty() && regularQueue.isEmpty()) {
            System.out.println("All queues are empty.");
        } else {
            System.out.println("Queues are not empty.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Train Station Queue Menu ---");
            System.out.println("1. Add Passenger");
            System.out.println("2. Board Next Passenger");
            System.out.println("3. Display Queues");
            System.out.println("4. Check if Queues are Empty");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Ticket Type: ");
                    String ticketType = sc.nextLine();
                    addPassenger(name, age, ticketType);
                    break;
                case 2:
                    boardNextPassenger();
                    break;
                case 3:
                    displayQueues();
                    break;
                case 4:
                    checkIfQueuesEmpty();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
