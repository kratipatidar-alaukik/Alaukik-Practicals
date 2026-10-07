package Day7;
import java.util.Scanner;


public class BankAccount {
     private int AccountNumber;
     private String AccountHolderName;
     private double Balance;

     public BankAccount(int AccountNumber, String AccountHolderName,  double Balance){
        this.AccountNumber=AccountNumber;
        this.AccountHolderName=AccountHolderName;
        this.Balance=Balance;
     }

    public boolean Deposit(double amount){
        if(amount>0){
            Balance=Balance+amount;
            return true;
        }
        System.out.println("Invalid Amount");
        return false;
     }

     public boolean WithDraw(double amount){
        if(amount<=Balance || amount>0){
        Balance=Balance-amount;
        System.out.println("Amount Deposited:"+amount);
        return true;
        }
        else{
            System.out.println("Invalid amount");
            return false;
        }
     }
    public double getbalance(){
        return Balance;
     }
      public void display(){
        System.out.println("AccountNumber :"+AccountNumber);
        System.out.println("AccountHolderName :" +AccountHolderName);
        System.out.println(" Current Balance " +Balance);
     }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the accountID");
        int AccountID=sc.nextInt();
        System.out.println("ENter the account holder name");
        String HolderName=sc.nextLine();
        System.out.println("Enter the opening balance:");
        double balance=sc.nextDouble();

        BankAccount obj=new BankAccount(AccountID,HolderName,balance);
        obj.display();
        System.out.print("\nEnter deposit amount: ");
        double deposit = sc.nextDouble();

        if (obj.Deposit(deposit)) {
            System.out.println("Deposit successful.");
        } 
        else {
            System.out.println("Invalid deposit transaction.");
        }

        System.out.print("\nEnter withdrawal amount: ");
        double withdrawal = sc.nextDouble();

        if (obj.WithDraw(withdrawal)) {
            System.out.println("Withdrawal successful.");
        } 
        else {
            System.out.println("Invalid withdrawal transaction.");
        }

        obj.display();
        

    }
    
}
