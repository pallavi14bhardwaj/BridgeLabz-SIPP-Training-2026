package event;

public class EventApp {
    public static void main(String[] args) {
        EventVerification system = new EventVerification();
        
        // testing logic
        system.registerParticipant("user1@example.com");
        system.registerParticipant("user2@example.com");
        
        // try to register duplicate
        system.registerParticipant("user1@example.com");
        
        system.displayParticipants();
        system.showTotalAttendees();
    }
}
