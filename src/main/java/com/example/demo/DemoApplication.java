package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import student.Student;
import student.StudentController;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = "student")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
