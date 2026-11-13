
package com.example.day31;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Day31Application {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(Day31Application.class, args);

        StudentService service =
                context.getBean(StudentService.class);

        service.showStudent();
    }
}
