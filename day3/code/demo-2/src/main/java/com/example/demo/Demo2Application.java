package com.example.demo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@SpringBootApplication
@EnableJpaRepositories
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {

			Book book=new Book("PBN789", "book", "1000.00", new Date());
			repository.save(book);

		};
	}
}
