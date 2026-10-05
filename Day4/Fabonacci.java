
import java.util.*;

public class Fabonacci {
    public static void main(String arg[]){
        System.out.println("Enter the number  of terms: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a=0;
        int b=1;

        for(int i=1;i<=n;i++){
            System.out.print(a + " ");
            int c=a+b;
            a=b;
            b=c;
        }

        
    }
}
