package com.swagger.service;

import com.swagger.dao.BookRepository;
import com.swagger.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
	@Autowired
	private BookRepository repository;

	public String saveBook(Book book) {
		repository.save(book);
		return "book save dwith id " + book.getBookId();
	}

//	public Book getBook(int bookId) {
//		return repository.findOne(bookId);
//	}

	public List<Book> removeBook(int bookId) {
		repository.deleteById(bookId);
		return repository.findAll();
	}
}
