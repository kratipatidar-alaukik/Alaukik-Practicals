package Day5;
import java.util.*;

class MaximumNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Max=0;
        System.out.println("Enter the Number of elements in the Array: ");
        int n=sc.nextInt();

        int nums[]=new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(Max<nums[i]){
                Max=nums[i];
            }
        }
        System.out.println("Maximum Number is: " +Max);


    }
}