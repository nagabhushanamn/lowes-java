package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Boy;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Girl;
import com.example.demo.repository.BoyGirlRepository;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(EmployeeRepository employeeRepository, BoyGirlRepository boyGirlRepository) {

		return args -> {

			// Boy boy = new Boy();
			// boy.setId(11);
			// boy.setName("B");
			//
			// Girl girl = new Girl();
			// girl.setId(22);
			// girl.setName("G");
			//
			// boy.setGirl(girl);
			//
			// boyGirlRepository.saveBoy(boy);

			// -----------------------------

			// Boy boy=boyGirlRepository.findOneBoy(11);
			// System.out.println(boy.getGirl()); // proxy:
			// System.out.println(boy);

			Girl girl = boyGirlRepository.findOneGirl(22);
			System.out.println(girl);
			System.out.println(girl.getBoy());

		};

	}

}
