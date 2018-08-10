package com.cg.bookService;

import java.util.Collection;

import com.cg.book.Book;

public interface BookService {

	public abstract void addBooks();
	
	Collection<Book> viewAllBooks();
	
	public abstract void addToCart(int bookId);
	
	public abstract void deleteFromCart(int bookId);
	
	public int getCartCount();
	
	Collection<Book> viewCart();
}
