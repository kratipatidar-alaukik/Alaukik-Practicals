import java.util.*;
class StudentMarksCalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of subjects:");
        int n=sc.nextInt();

        int marks[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter marks for subject "+(i+1)+":");
            marks[i]=sc.nextInt();
        }

        int total=0;
        for(int mark:marks){
            total=total+mark;
        }
        
        double percentage= (double) total/n;
        char grade;
        if(percentage>=90){
            grade='A';
        }
        else if(percentage>=80){
            grade='B';
        }
        else if(percentage>=70){
            grade='C';
        }
        else if(percentage>=60){
            grade='D';
        }
        else{
            grade='F';
        }

        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+percentage);
        System.out.println("Grade: "+grade);

    }
}

