package Day7;

class Employee {

    private int id;
    private String name;
    private double salary;
    private String email;
    private String password;

    Employee(int id, String name, double salary, String email, String password) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.password = password;
    }

    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

   
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }

   
    public void changePassword(String oldPassword, String newPassword) {

        if (password.equals(oldPassword) && newPassword.length() >= 6) {
            password = newPassword;
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Invalid password.");
        }
    }

   
    public void displayDetails() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
    }

    public static void main(String[] args) {

        Employee emp = new Employee(101,"krati",50000,"krati@gmail.com","krati123");

        emp.displayDetails();
        emp.setSalary(60000);
        emp.setEmail("krati123@gmail.com");
        emp.changePassword("krati123", "java123");
        System.out.println("After Update:");

        emp.displayDetails();
    }
}
