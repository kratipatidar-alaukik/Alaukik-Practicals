package Day6;

public class BankAccountMAnagement {
    int accNum;
    String holdername;
    double balance;

    BankAccountMAnagement(int accNum,String holdername, double balance){
        this.accNum=accNum;
        this.holdername=holdername;
        this.balance=balance;
    }

    void deposit(double amount){
        balance=balance+amount;
        System.out.println("Deposited:" +balance);

    }
     void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Amount Withdrawn");
        }
        else{
            System.out.println("Insufficient Balance");
        }
     }

     void displayDetails(){
        System.out.println("Account Number: "+accNum);
        System.out.println("holdername "+holdername);
        System.out.println("Account balance: "+balance);
        
     }

    public static void main(String args[]){
       BankAccountMAnagement obj=new BankAccountMAnagement(1002,"krati",10000);
       obj.displayDetails();
       System.out.println();
       
       obj.deposit(2000);
       obj.withdraw(1000);
       System.out.println();

       obj.displayDetails();

    }



}
