package Day9;
// using runtime polymorphism
class Payment{
    void pay(){
        System.out.println("Payment is successfull:");
    }
}

class CashPayment extends Payment {
    void pay(){
        System.out.println("Payment is successfull using Cash ");
    }
}

class CardPayment extends Payment {
    void pay(){
        System.out.println("Payment is successfull using Card ");
    }
}
class UPI extends Payment {
    void pay(){
        System.out.println("Payment is successfull using UPI ");
    }
}



public class PaymentMethods {
public static void main(String args[]){
    Payment p;
    p=new CashPayment();
    p.pay();
    p=new CardPayment();
    p.pay();
    p=new UPI();
    p.pay();
}    
}
