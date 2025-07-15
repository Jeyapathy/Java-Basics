/* Day 07 - Problem Solving for the day - 09.07.2025

Flight Schedule Manager for an airline. Each flight is represented by a Flight node containing:

1.Flight number

2.Destination

3.Departure time

Use a Doubly Linked List to manage the schedule. The system must support the following operations:

- Add a new flight at the beginning of the schedule.

- Add a new flight at the end of the schedule.

- Add a new flight at a specific position.

- Delete a flight from the beginning.

- Delete a flight from the end.

- Delete a flight from a specific position.

- Display the current flight schedule (from beginning to end).  */

public class pltDaySeven {
    
    static class Flight {
        String flightNumber;
        String destination;
        String departureTime;
        Flight next;
        Flight prev;

        Flight(String flightNumber, String destination, String departureTime) {
            this.flightNumber = flightNumber;
            this.destination = destination;
            this.departureTime = departureTime;
            this.next = null;
            this.prev = null;
        }
    }

    static class FlightSchedule {
        Flight head;

        // Add flight at the beginning
        public void addFlightAtBeginning(String flightNumber, String destination, String departureTime) {
            Flight newFlight = new Flight(flightNumber, destination, departureTime);
            if (head != null) {
                newFlight.next = head;
                head.prev = newFlight;
            }
            head = newFlight;
        }

        // Add flight at the end
        public void addFlightAtEnd(String flightNumber, String destination, String departureTime) {
            Flight newFlight = new Flight(flightNumber, destination, departureTime);
            if (head == null) {
                head = newFlight;
                return;
            }
            Flight current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newFlight;
            newFlight.prev = current;
        }

        // Add flight at a specific position
        public void addFlightAtPosition(int position, String flightNumber, String destination, String departureTime) {
            if (position < 0) return; // Invalid position
            Flight newFlight = new Flight(flightNumber, destination, departureTime);
            if (position == 0) {
                addFlightAtBeginning(flightNumber, destination, departureTime);
                return;
            }
            Flight current = head;
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) return; // Position is out of bounds
            newFlight.next = current.next;
            if (current.next != null) {
                current.next.prev = newFlight;
            }
            current.next = newFlight;
            newFlight.prev = current;
        }

        // Delete flight from the beginning
        public void deleteFlightFromBeginning() {
            if (head == null) return; // No flights to delete
            head = head.next;
            if (head != null) {
                head.prev
    = null; // Update head's previous pointer
            }
        }

        // Delete flight from the end
        public void deleteFlightFromEnd() {
            if (head == null) return; // No flights to delete
            Flight current = head;
            while (current.next != null) {
                current = current.next;
            }
            if (current.prev != null) {
                current.prev.next = null; // Update previous flight's next pointer
            } else {
                head = null; // If there was only one flight
            }
        }

        // Delete flight from a specific position
        public void deleteFlightFromPosition(int position) {
            if (position < 0 || head == null) return; // Invalid position or no flights
            if (position == 0) {
                deleteFlightFromBeginning();
                return;
            }
            Flight current = head;
            for (int i = 0; i < position && current != null; i++) {
                current = current.next;
            }
            if (current == null) return; // Position is out of bounds
            if (current.prev != null) {
                current.prev.next = current.next; // Update previous flight's next pointer
            }
            if (current.next != null) {
                current.next.prev = current.prev; // Update next flight's previous pointer
            }
        }

        // Display the flight schedule
        public void displaySchedule() {
            Flight current = head;
            if (current == null) {
                System.out.println("No flights scheduled.");
                return;
            }
            System.out.println("Current Flight Schedule:");
            while (current != null) {
                System.out.println("Flight Number: " + current.flightNumber + ", Destination: " + current.destination + ", Departure Time: " + current.departureTime);
                current = current.next;
            }
        }
    }


}
