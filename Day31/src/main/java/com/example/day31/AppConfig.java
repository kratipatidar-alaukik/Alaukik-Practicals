
package com.example.day31;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student() {
        return new Student();
    }

    @Bean
    public StudentService studentService(Student student) {
        return new StudentService(student);
    }
}
