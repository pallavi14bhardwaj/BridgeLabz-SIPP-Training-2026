package attendance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttendanceTracker {
    // HashMap where Key -> Subject Name, Value -> List of students present
    private Map<String, List<String>> attendanceMap = new HashMap<>();

    // 1. Mark attendance for students in different subjects
    // 2. Prevent duplicate attendance for the same student in a subject
    public void markAttendance(String subject, String studentName) {
        // if subject doesn't exist, create an empty list for it
        attendanceMap.putIfAbsent(subject, new ArrayList<>());
        
        List<String> studentsPresent = attendanceMap.get(subject);
        
        // check for duplicates before adding
        if (studentsPresent.contains(studentName)) {
            System.out.println("Warning: " + studentName + " is already marked present for " + subject);
        } else {
            studentsPresent.add(studentName);
            System.out.println("Success: Marked " + studentName + " present in " + subject);
        }
    }

    // 3. Display the list of students present in each subject
    public void displayAttendance() {
        System.out.println("\n--- Subject-wise Attendance List ---");
        if (attendanceMap.isEmpty()) {
            System.out.println("No attendance recorded yet.");
            return;
        }

        for (Map.Entry<String, List<String>> entry : attendanceMap.entrySet()) {
            System.out.println("Subject: " + entry.getKey());
            System.out.println("Students: " + entry.getValue());
            System.out.println();
        }
    }

    // 4. Show the total number of students present in every subject
    public void showTotalStudents() {
        System.out.println("--- Total Students per Subject ---");
        for (Map.Entry<String, List<String>> entry : attendanceMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().size() + " students");
        }
        System.out.println("----------------------------------\n");
    }
}
