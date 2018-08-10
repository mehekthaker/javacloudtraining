package com.cg.bookService;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.book.Book;
import com.cg.bookDao.BookDao;
import com.cg.bookDao.BookDaoImpl;
import com.cg.cartlist.CartList;

public class BookServiceImpl implements BookService{

	private BookDao dao = new BookDaoImpl();
	CartList cart = new CartList();
	private Map<Integer, Book> booksDB = new HashMap<Integer, Book>();
	
	@Override
	public void addBooks() {
		dao.addBooks();
	}

	@Override
	public Collection<Book> viewAllBooks() {
		
		return dao.viewAllBooks();
	}

	@Override
	public void addToCart(int bookId) {
		cart.addToCart(bookId);
		
	}

	@Override
	public void deleteFromCart(int bookId) {
		cart.deleteFromCart(bookId);
		
	}

	@Override
	public Collection<Book> viewCart() {
		return cart.viewCart();
	}
	public int getCartCount()
	{
		return cart.getCartCount();
	}

	

}
