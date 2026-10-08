package Day8;

class Employee{
    int ID;
    String name;
    double salary;

    Employee(int ID, String name, double salary){
        this.ID=ID;
        this.name=name;
        this.salary=salary;
    }

    void display(){
        System.out.println("Id: "+ID);
        System.out.println("Name: " +name);
        System.out.println("salary : " +salary);
    }
}

class Developer extends Employee{
    String language;
    Developer(int ID, String name, double salary,String language){
        super( ID,  name,  salary);
        this.language=language;
    }

    void display(){
    super.display();
    System.out.println("Language: "+language);
    }

}

class SeniorDeveloper extends Developer{
    int experience;
    SeniorDeveloper(int ID, String name, double salary,String language,int experience){
        super( ID, name,  salary, language);
        this.experience=experience;

        }

        void display(){
            super.display();
            System.out.println("Total Experience : "+ experience+ "years");
    }
}

class Main{
    public static void main(String args[]){
      SeniorDeveloper s=new SeniorDeveloper(101,"krati",60000,"java",5);
      s.display();
    }
}