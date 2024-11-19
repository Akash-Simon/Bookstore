package com.example.bookstore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.bookstore.service.*;
import com.example.bookstore.model.*;
@RestController
public class HomeController {

		@Autowired
		BookService s;
		
		@GetMapping("/details")
		public List<Book>get123()
		{
			return s.get();
		}
		
		@PostMapping("/add")
		public ResponseEntity<Book> get456(@RequestBody Book book)
		{
			Book b = s.get1(book);
			return ResponseEntity.status(HttpStatus.CREATED).body(b);
		}

		@GetMapping("details/{id}")
		public ResponseEntity<Book> get678(@PathVariable Long id)
		{
			Optional<Book> book = s.get2(id);
			return book.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

		}

}
