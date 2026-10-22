package Day18;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + department + " - " + salary;
    }
}

public class EmployeeAnalytics {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Rahul", "IT", 50000),
                new Employee(2, "Priya", "HR", 45000),
                new Employee(3, "Aman", "IT", 70000),
                new Employee(4, "Neha", "Finance", 60000),
                new Employee(5, "Krati", "IT", 80000),
                new Employee(6, "Riya", "HR", 55000)
        );

        // Display all employees
        System.out.println("All Employees:");
        employees.stream()
                .forEach(System.out::println);

        // Employees with salary above 50000
        System.out.println("\nSalary above 50000:");
        employees.stream()
                .filter(e -> e.salary > 50000)
                .forEach(System.out::println);

        //Get only employee names
        System.out.println("\nEmployee Names:");
        employees.stream()
                .map(e -> e.name)
                .forEach(System.out::println);

        //Sort employees by salary
        System.out.println("\nSorted by Salary:");
        employees.stream()
                .sorted(Comparator.comparingDouble(e -> e.salary))
                .forEach(System.out::println);

        //Unique departments
        System.out.println("\nDepartments:");
        employees.stream()
                .map(e -> e.department)
                .distinct()
                .forEach(System.out::println);

        //Top 3 highest-paid employees
        System.out.println("\nTop 3 Highest Paid:");
        employees.stream()
                .sorted(Comparator.comparingDouble((Employee e) -> e.salary)
                        .reversed())
                .limit(3)
                .forEach(System.out::println);

        // Total salary
        double totalSalary = employees.stream()
                .map(e -> e.salary)
                .reduce(0.0, (a, b) -> a + b);

        System.out.println("\nTotal Salary: " + totalSalary);

        // Collect IT employees into a List
        List<Employee> itEmployees = employees.stream()
                .filter(e -> e.department.equals("IT"))
                .collect(Collectors.toList());

        System.out.println("\nIT Employees:");
        itEmployees.forEach(System.out::println);
    }
}