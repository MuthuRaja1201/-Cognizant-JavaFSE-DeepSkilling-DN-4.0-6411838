public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        // Adding employees
        manager.addEmployee(new Employee(1, "Ravi", "Manager", 75000));
        manager.addEmployee(new Employee(2, "Divya", "Developer", 55000));
        manager.addEmployee(new Employee(3, "Anil", "Tester", 45000));

        // Display all employees
        manager.traverseEmployees();

        // Search for an employee
        Employee emp = manager.searchEmployee(2);
        System.out.println("\nSearch Result:");
        if (emp != null) {
            System.out.println(emp);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee
        manager.deleteEmployee(2);

        // Display after deletion
        System.out.println("\nAfter Deletion:");
        manager.traverseEmployees();
    }
}
