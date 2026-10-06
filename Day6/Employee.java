package Day6;


class Employee {

    int id;
    String name;
    double salary;
    String department;

    Employee(int id, String name, double salary, String department){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department=department;

    }
    void display(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee name: "+name);
        System.out.println("Employee salary: "+salary);
        System.out.println("Employee department: "+department);

    }

    public static void main(String args[]){
        Employee e1=new Employee(1,"krati",50000,"IT");
        e1.display();
    }
}