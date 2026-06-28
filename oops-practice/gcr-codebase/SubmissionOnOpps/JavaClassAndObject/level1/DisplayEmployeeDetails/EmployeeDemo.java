package oppsPracticeProblem.JavaClassAndObject.level1.DisplayEmployeeDetails;
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.name = "Apeksha";
        emp.id = 101;
        emp.salary = 50000;

        emp.displayDetails();
    }
}