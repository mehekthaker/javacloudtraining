package com.cg.cartlist;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cg.book.Book;
import com.cg.bookDao.BookDao;
import com.cg.bookDao.BookDaoImpl;

public class CartList {
	Book book ;
	private BookDao dao ;
	private int cartCount;
	public CartList() {
		super();
		book =  new Book();
		dao =  new BookDaoImpl();
		cartCount = 0;
	}


	public static Map<Integer, Book> bookmap = new HashMap<>();
	
		
	public int getCartCount() {
		return cartCount;
	}

	public void addToCart(int bookId) {
		boolean flag=true;
		cartCount++;
		System.out.println(cartCount);
		
		for(Book book :viewCart()) {
			if(book.getBookId() == bookId) {
				book.setBookCount(book.getBookCount()+1);
				book.setBookPrice(book.getBookPrice()+book.getBookPrice());
				flag=false;
				break;
			}
		}
		if(flag)
			dao.viewAllBooks().stream().forEach((e) -> {if(e.getBookId() == bookId) {	
				bookmap.put(e.getBookId(), e);
				}
	});
	System.out.println(bookmap);
	}
	
	public Collection<Book> viewCart() {
		return bookmap.values();
	}
	
	
	public void deleteFromCart(int bookId) {
		for(Book book : viewCart()) 
		{
			if(book.getBookId() == bookId)
			{	
				bookmap.remove(bookId);
				break;
			}
			
		}
		
		}
		
//		Set<Entry<Integer, Book>> set = bookmap.entrySet();
//		set.stream().forEach((e) -> {if(e.getKey() == bookId)	
//			set.remove(e.getKey, e);
//		});
	}

