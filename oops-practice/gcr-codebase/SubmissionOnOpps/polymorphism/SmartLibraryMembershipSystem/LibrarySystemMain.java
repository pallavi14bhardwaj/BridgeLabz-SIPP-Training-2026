package oppsPracticeProblem.polymorphism.SmartLibraryMembershipSystem;
public class LibrarySystemMain {

    public static void main(String[] args) {

        LibraryMember[] members = new LibraryMember[3];

        members[0] = new StudentMember("Apeksha", "S101");
        members[1] = new FacultyMember("Rahul", "F201");
        members[2] = new GuestMember("Priya", "G301");

        int overdueDays = 4;

        System.out.println("Member Details and Fine:\n");

        // Dynamic Method Dispatch
        for (LibraryMember m : members) {
            m.printDetails();
            System.out.println("Fine : ₹" +
                    m.calculateFine(overdueDays));
            System.out.println();
        }

        // Search member by ID
        String searchId = "F201";
        boolean found = false;

        for (LibraryMember m : members) {
            if (m.memberId.equals(searchId)) {
                System.out.println("Member Found:");
                m.printDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Member ID not found.");
        }
    }
}