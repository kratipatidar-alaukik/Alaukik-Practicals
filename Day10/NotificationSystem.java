package Day10;
import java.util.*;

//Using Interface 

interface Notification {
void Show();
    
}
class Email implements Notification{
    public void Show(){
        System.out.println("Email notifiaction received: ");
    }

}
class SMS implements Notification{
    public void Show(){
        System.out.println("SMS notifiaction received: ");
    }

}

class WhatsApp implements Notification{
    public void Show(){
        System.out.println("WhatsApp notifiaction received: ");
    }

}
public class NotificationSystem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Email");
        System.out.println("2.SMS ");
        System.out.println("3. WhatsApp");
        System.out.println("Choose NotifiactionType: ");
        int choice=sc.nextInt();
        
       Notification n;
         switch(choice){
            case 1: 
            n =new Email();
            break;

            case 2: 
            n=new SMS();
            break;

            case 3: 
            n=new WhatsApp();
            break;

            default:
                System.out.println("InvalidInput");
                sc.close();
                return;

         }

         n.Show();

    }
}
