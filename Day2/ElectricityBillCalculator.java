import java.util.Scanner;
class ElectricityBillCalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of units consumed:");
        int units=sc.nextInt();

        int rate;
        if(units<=100){
            rate=5;
        }
        else if(units<=200){
            rate=7;
        }
        else if(units<=300){
            rate=10;
        }
        else{
            rate=15;
        }

        int bill=units*rate;
        System.out.println("Units Consumed = " + units);
        System.out.println("Rate per unit = ₹" + rate);
        System.out.println("Electricity Bill = ₹" + bill);

    }      
}