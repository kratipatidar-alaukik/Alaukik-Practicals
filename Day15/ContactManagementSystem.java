package Day15;
import java.util.*;

class ContactManagementSystem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashMap<String,String> contacts=new HashMap<>();
        System.out.println("Enter the Contact Number: ");
        String number=sc.nextLine();

        if(contacts.containsKey(number)){
            System.out.println("Contact Already exists");
        }
        else{
            System.out.print("Enter a NAme: ");
            String name=sc.nextLine();
            contacts.put(number,name);
            System.out.println("Contact Added Successfully");

        }

        System.out.print("Enter number to search: ");
        number = sc.nextLine();

        if (contacts.containsKey(number)) {
            System.out.println("Name: " + contacts.get(number));
        } else {
            System.out.println("Contact not found!");
        }

        System.out.print("Enter number to search: ");
        number = sc.nextLine();

        if (contacts.containsKey(number)) {
            contacts.remove(number);
            System.out.println("Conatact deleted successfully:");
        } else {
            System.out.println("Contact not found!");
        }


    }
}