package event;

import java.util.HashSet;
import java.util.Set;

public class EventVerification {
    // using HashSet to store unique email IDs
    private Set<String> registeredEmails = new HashSet<>();

    // 1. Register new participants & 2. Prevent duplicate registrations
    public void registerParticipant(String email) {
        // add() returns false if the element is already present in the set
        if (registeredEmails.add(email.toLowerCase())) {
            System.out.println("Success: " + email + " registered successfully.");
        } else {
            System.out.println("Rejected: Duplicate entry detected for " + email);
        }
    }

    // 3. Display all unique registered participants
    public void displayParticipants() {
        System.out.println("\n--- Unique Registered Participants ---");
        if (registeredEmails.isEmpty()) {
            System.out.println("No participants registered yet.");
        } else {
            for (String email : registeredEmails) {
                System.out.println(email);
            }
        }
    }

    // 4. Show the total number of attendees eligible to enter
    public void showTotalAttendees() {
        System.out.println("Total eligible attendees: " + registeredEmails.size());
        System.out.println("--------------------------------------\n");
    }
}
