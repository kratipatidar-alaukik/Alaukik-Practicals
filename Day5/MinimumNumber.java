package Day5;

import java.util.Scanner;

class MinimumNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Number of elements in the Array: ");
        int n=sc.nextInt();

        int nums[]=new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int Min=nums[0];

        for(int i=0;i<n;i++){
            if(Min>nums[i]){
               Min=nums[i];
            }
        }
        System.out.println("Maximum Number is: " +Min);


    }
}