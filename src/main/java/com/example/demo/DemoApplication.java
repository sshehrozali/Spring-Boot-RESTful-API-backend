package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import student.Student;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// REST Endpoint
	@GetMapping
	public List<Student> Studentpage() {
		return List.of(
				new Student(
						1,
						"Ayesha",
						LocalDate.of(2000, Month.JANUARY, 13)
				)
		);
	}

}
