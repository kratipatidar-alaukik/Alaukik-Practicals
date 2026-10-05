import java.util.*;

public class ReverseNumber {
    public static void main(String arg[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n=sc.nextInt();
      int reverse=0;
      int original=n;

      while(n>0){
        int digit= n%10;
        reverse=reverse*10+digit;
        n=n/10;
      }

      if(reverse==original){
        System.out.println("Palindrome");
      }
      else{
        System.out.println("Not Palindrome");
      }
    }
}
