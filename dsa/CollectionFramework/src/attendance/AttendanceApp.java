package attendance;

public class AttendanceApp {
    public static void main(String[] args) {
        AttendanceTracker tracker = new AttendanceTracker();
        
        // testing logic
        tracker.markAttendance("Java Programming", "Alice");
        tracker.markAttendance("Java Programming", "Bob");
        tracker.markAttendance("Data Structures", "Alice");
        
        // trying to mark duplicate
        tracker.markAttendance("Java Programming", "Alice");
        
        tracker.displayAttendance();
        tracker.showTotalStudents();
    }
}
