package oppsPracticeProblem.JavaClassAndObject.level2.SimulateStudentReport;
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Apeksha";
        s.rollNumber = 101;
        s.marks = 88;

        s.displayDetails();
    }
}