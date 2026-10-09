package Day9;
//Implementing Downcasting and upcasting
class payment{
 void process(){
    System.out.println("Processing payment........");
 }
}
class cashpayment extends payment{
   void Cashdetails(){
    System.out.println("Payment done using Cash");
   }
}

class cardpayment extends payment{
   void CardDetails(){
    System.out.println("Payment done using Card");
   }
}
class UPIpayment extends payment{
   void UPIDetails(){
    System.out.println("Payment done using UPI");
   }
}

public class PaymentProcessingSystem {
public static void main(String args[]){
    //upcasting 
    payment p=new UPIpayment();
    p.process();

    UPIpayment upi=(UPIpayment) p;
    upi.UPIDetails();
    

    

}
}
