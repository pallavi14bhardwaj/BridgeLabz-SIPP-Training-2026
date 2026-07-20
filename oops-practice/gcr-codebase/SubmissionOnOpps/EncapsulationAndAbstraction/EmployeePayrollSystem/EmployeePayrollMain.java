package oppsPracticeProblem.EncapsulationAndAbstraction.EmployeePayrollSystem;

public class EmployeePayrollMain {

    public static void main(String[] args) {

        FullTimeEmployee fullTime =
                new FullTimeEmployee(
                        101,
                        "Pallavi",
                        50000);

        PartTimeEmployee partTime =
                new PartTimeEmployee(
                        102,
                        "Rahul",
                        80,
                        500);

        System.out.println("----- Full Time Employee -----");
        fullTime.displayEmployeeInfo();
        System.out.println("Salary : " + fullTime.calculateSalary());

        System.out.println();

        System.out.println("----- Part Time Employee -----");
        partTime.displayEmployeeInfo();
        System.out.println("Salary : " + partTime.calculateSalary());
    }
}