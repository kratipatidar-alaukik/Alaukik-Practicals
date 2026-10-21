package Day17;
import java.util.*;
import java.util.function.*;


class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " - " + name + " - " + salary;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Krati", 50000));
        employees.add(new Employee(2, "Rahul", 70000));
        employees.add(new Employee(3, "Priya", 40000));

        //Filter
        Predicate<Employee> filter = e -> e.salary > 45000;
        System.out.println("Filtered Employees:");
        for (Employee e : employees) {
            if (filter.test(e)) {
                System.out.println(e);
            }
        }

        //Sort
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));

        System.out.println("Sorted Employees:");
        for (Employee e : employees) {
            System.out.println(e);
        }
        //Yearly Salary Calcuation
       Function<Employee,Double> calculate=e->e.salary*12;

        System.out.println("\nYearly Salary:");
        for (Employee e : employees) {
            System.out.println(e.name + " = " + calculate.apply(e));
        }

        //Search
        Predicate<Employee> search= e->e.name.equals("Krati");
        System.out.println("Search Result:");
        for (Employee e : employees) {
            if (search.test(e)) {
                System.out.println(e);
            }
        }




    }
}