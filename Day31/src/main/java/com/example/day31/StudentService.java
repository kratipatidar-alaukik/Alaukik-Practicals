
package com.example.day31;

public class StudentService {

    private Student student;

    public StudentService(Student student) {
        this.student = student;
    }

    public void showStudent() {
        student.display();
    }
}
