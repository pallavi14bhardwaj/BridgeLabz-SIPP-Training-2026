package sorting;

import java.util.Arrays;

public class AttendanceRanking {
    
    // A custom object to tie attendance and ID together
    static class Employee implements Comparable<Employee> {
        int id;
        int attendance;
        
        public Employee(int id, int attendance) {
            this.id = id;
            this.attendance = attendance;
        }
        
        // Sorting logic: highest attendance first, if tied then smallest ID first
        @Override
        public int compareTo(Employee other) {
            if (this.attendance != other.attendance) {
                // sort descending by attendance
                return Integer.compare(other.attendance, this.attendance);
            } else {
                // sort ascending by ID when tied
                return Integer.compare(this.id, other.id);
            }
        }
    }

    // Returns the top K employee IDs based on attendance ranking rules
    public static int[] getTopKEmployees(int[] employeeIds, int[] attendance, int k) {
        int n = employeeIds.length;
        Employee[] employees = new Employee[n];
        
        for (int i = 0; i < n; i++) {
            employees[i] = new Employee(employeeIds[i], attendance[i]);
        }
        
        // Arrays.sort works perfectly here since we implemented Comparable logic above
        Arrays.sort(employees);
        
        int[] topK = new int[k];
        for (int i = 0; i < k; i++) {
            topK[i] = employees[i].id;
        }
        
        return topK;
    }

    public static void main(String[] args) {
        int[] empIds = {101, 102, 103, 104, 105};
        int[] attendance = {92, 85, 98, 92, 80};
        int k = 3;
        
        int[] top3 = getTopKEmployees(empIds, attendance, k);
        System.out.println("Top " + k + " Employees: " + Arrays.toString(top3));
    }
}
