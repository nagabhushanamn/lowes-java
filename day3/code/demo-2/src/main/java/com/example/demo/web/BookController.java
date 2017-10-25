package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;

@RestController
@RequestMapping("/books")
class UserController {

	@RequestMapping("/{isbn}")
	public Book getBook(@PathVariable("isbn") Book book) {
		return book;
	}
}