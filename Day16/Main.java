package Day16;

import java.util.ArrayList;

class Employee{
    int id;
    String name;

    Employee(int id ,String name){
        this.id=id;
        this.name=name;
    }

    public String toString(){
        return id+" "+name;
    }
}

class Repository<T>{
    ArrayList<T> list =new ArrayList<>();
    //add
    void add(T item){
      list.add(item);
    }
    //display
    void display(){
      for(T item:list){
        System.out.println(item);
      }
    }
    //update
   void update(int index, T item) {
        list.set(index, item);
    }
    //delete
    void delete(int index){
        list.remove(index);
    }
    
}
public class Main {
    public static void main(String args[]){
        Repository<Employee> repo= new Repository<>();
        repo.add(new Employee(1,"Krati"));
        repo.add(new Employee(2,"khushi"));
         repo.add(new Employee(3,"KIKI"));

        System.out.println("Employees: ");
        repo.display();
        repo.update(1,new Employee(2,"Jayesh"));
        repo.delete(2);

         System.out.println("\nAfter Update and Delete:");
        repo.display();

    }
}
