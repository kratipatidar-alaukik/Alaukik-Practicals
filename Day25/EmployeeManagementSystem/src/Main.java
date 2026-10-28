import model.Employee;
import service.EmployeeService;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EmployeeService service = new EmployeeService();

        int choice;

        do {
            System.out.println("   EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Search Employee");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter employee email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();

                    Employee employee =
                            new Employee(name, email, salary);
                            service.addEmployee(employee);

                    break;
  
                  case 2:
                    List<Employee> employees =
                            service.getAllEmployees();
                            if (employees.isEmpty()) {
                                System.out.println("No employees found.");
                            } else {
                                 System.out.println("\n----- Employee List -----");

                        for (Employee emp : employees) {
                            System.out.println(emp);
                        }
                    }

                    break;


                case 3:
                    System.out.print("Enter employee ID: ");
                    int updateId = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();

                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();

                    Employee updatedEmployee =
                            new Employee( updateId,newName,newEmail,newSalary);
                            service.updateEmployee(updatedEmployee);

                    break;


                case 4:
                    System.out.print("Enter employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    service.deleteEmployee(deleteId);
                     break;

                 case 5:
                    System.out.print("Enter employee ID to search: ");
                    int searchId = scanner.nextInt();

                    Employee foundEmployee =
                            service.searchEmployee(searchId);

                    if (foundEmployee != null) {
                        System.out.println("\nEmployee Found:");
                        System.out.println(foundEmployee);

                    } else {
                         System.out.println("Employee not found.");
                    }
                    break;


                case 6:
                    System.out.println("Thank you for using Employee Management System!");
                    break;


                default:
                     System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);
        scanner.close();
    }
}