package Day19;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Attendance {

    int id;
    String name;
    LocalTime checkIn, checkOut;

    Attendance(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void checkIn() {
        checkIn = LocalTime.now();
        System.out.println("Check-in: " + checkIn);
    }

    void checkOut() {
        checkOut = LocalTime.now();
        System.out.println("Check-out: " + checkOut);
    }

    void workingHours() {
        if (checkIn == null || checkOut == null) {
            System.out.println("Check-in and check-out first.");
            return;
        }

        Duration d = Duration.between(checkIn, checkOut);

        System.out.println("Working Hours: "
                + d.toHours() + " hours "
                + d.toMinutes() % 60 + " minutes");
    }

    void report() {
        System.out.println("\n--- Attendance Report ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date: " +
                LocalDate.now().format(
                        DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Check-in: " + checkIn);
        System.out.println("Check-out: " + checkOut);

        workingHours();
    }
}

public class EmployeeAttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        Attendance a = new Attendance(id, name);
        int choice;
        do{

        System.out.println("1. Check-in");
        System.out.println("2. Check-out");
        System.out.println("3. Working Hours");
        System.out.println("4. Report");
        System.out.println("5. Exit");

        System.out.print("Enter choice: ");
       choice = sc.nextInt();

        
        switch (choice) {
            case 1 -> a.checkIn();
            case 2 -> a.checkOut();
            case 3 -> a.workingHours();
            case 4 -> a.report();
            case 5 -> System.out.println("Thank you");
            default -> System.out.println("Invalid choice");
        }}
        while(choice !=5);

        sc.close();
    }
}