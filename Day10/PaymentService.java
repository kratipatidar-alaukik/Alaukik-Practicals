package Day9;
import java.util.*;

interface Payment {
void pay(double amount);
    
}
class CashPayment implements Payment{
    public void pay(double amount){
        System.out.println("Payment done using Cash : "+amount);
    }

}
class CardPayment implements Payment{
     public void pay(double amount){
        System.out.println("Payment done using Card : "+amount);
    }

}

class UPIPayment implements Payment{
     public void pay(double amount){
        System.out.println("Paymentn done using UPI: "+amount);
    }
}
public class PaymentService{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Cash PAyment ");
        System.out.println("2. Card  PAyment ");
        System.out.println("3. UPI PAyment ");
        System.out.println("Choose one of the payment method: ");
        int choice=sc.nextInt();
        
        System.out.println("ENter the amount :");
        int amount=sc.nextInt();
        Payment p;
         switch(choice){
            case 1: 
            p =new CashPayment();
            break;

            case 2: 
            p =new CardPayment();
            break;

            case 3: 
            p =new UPIPayment();
            break;

            default:
                System.out.println("InvalidInput");
                sc.close();
                return;

         }

         p.pay(5000);

    }
}
