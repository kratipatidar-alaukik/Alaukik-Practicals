package Day5;
import java.util.*; 

public class StudentResultManagement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n=sc.nextInt();

        String names[]=new String[n];
        int marks[]=new int[n];
        char grade[]=new char[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the Name of student" +(i+1));
            names[i]=sc.nextLine();
            System.out.println("Enter the marks : " );
            marks[i]=sc.nextInt();

            if (marks[i] >= 90) {
                grade[i] = 'A';
            } 
            else if (marks[i] >= 80) {
                grade[i] = 'B';
            } 
            else if (marks[i] >= 70) {
                grade[i] = 'C';
            } 
            else if (marks[i] >= 60) {
                grade[i] = 'D';
            } 
            else {
                grade[i] = 'F';
            }   
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Name: " +names[i]);
            System.out.println("Marks: " +marks[i]);
            System.out.println("Grade: " +grade[i]);
            System.out.println("------------ ");
        }

    }
}
            
    







    

