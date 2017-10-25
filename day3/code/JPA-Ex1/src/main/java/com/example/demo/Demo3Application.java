package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Gender;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(EmployeeRepository employeeRepository) {

		return args -> {

			// Employee employee = new Employee(12, "Nag", 100.00);
			// employee.setGender(Gender.MALE);
			// employeeRepository.save(employee);
			
			//----------------------------------
			
			Employee employee=employeeRepository.findOne(12);
			System.out.println(employee);

		};

	}

}
