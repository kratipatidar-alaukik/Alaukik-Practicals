package Day14;
import java.util.*;
class Employee{
    int id;
    String name;
    double salary;

    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    void display(){
        System.out.println("ID: "+id +"Name: " +name +"Salary: " +salary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String args[]){
      ArrayList <Employee>  list=new ArrayList<>();
      Scanner sc=new Scanner(System.in);
      
       while(true){
        System.out.println("Enter the choice: /n 1.Add  2.Update  3.Delete  4.Search  5.Display  6.Exit");
        int choice= sc.nextInt();

        if(choice==1){
            System.out.println("Enter the ID:");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name:");
            String name=sc.nextLine();
            System.out.println("Enter the salary:");
            double salary=sc.nextDouble();

            list.add(new Employee( id,name,salary));

        }

        else if(choice==2){
             System.out.println("Enter the ID:");
            int id=sc.nextInt();

            for(Employee e:list){
                System.out.print("New Name: ");
                        e.name = sc.nextLine();

                        System.out.print("New Salary: ");
                        e.salary = sc.nextDouble();
            }
        }

        else if(choice ==3){
             System.out.println("Enter the ID:");
            int id=sc.nextInt();
            
            for(int i=0;i<list.size();i++){
                if(list.get(id).id==id){
                    list.remove(i);
                    break;
                }
            }

        }

        else if(choice==4){
             System.out.println("Enter the ID:");
            int id=sc.nextInt();

            for(Employee e:list){
                if(e.id==id){
                    e.display();
                }
            }
        }
        else if(choice==5){
            
            for(Employee e:list){
                e.display();
            }

        }
        else if(choice==6){
            break;
        }
       }

    }
    
}
