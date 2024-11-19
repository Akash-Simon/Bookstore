package com.example.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstore.dao.*;
import com.example.bookstore.model.*;

@Service
public class BookService {
@Autowired
private BookResp r;
	//select all
	public List<Book> get()
	{
		return r.findAll();
	}
	//insert
	public Book get1(Book book)
	{
		return r.save(book);
	}
	
	public Optional<Book> get2(Long id)
	{
		return r.findById(id);
	}

}
