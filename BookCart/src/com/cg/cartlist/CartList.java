package com.cg.cartlist;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cg.book.Book;

public class CartList {
	Book book = new Book();
	Map<Integer, Book> bookmap = new HashMap<>();
	
	public void addToCart(int bookId) {
		Set<Entry<Integer, Book>> entry = bookmap.entrySet();
		entry.stream().forEach((e) -> {if(book.getBookId() == bookId)
			bookmap.put(book.getBookId(), book);});
	}
	
	public Collection<Book> viewAll() {
		return bookmap.values();
	}
	
	public void deleteFromCart(int bookId) {
		bookmap.remove(book);
	}
}
