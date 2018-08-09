package com.cg.bookDao;

import java.util.Collection;

import com.cg.book.Book;

public interface BookDao {

	public abstract void addBooks();
	
	Collection<Book> viewAllBooks();
	
	public abstract void addToCart(int bookId);
		
	
}
