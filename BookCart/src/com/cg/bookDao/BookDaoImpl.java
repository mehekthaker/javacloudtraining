package com.cg.bookDao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.book.Book;
import com.cg.cartlist.CartList;

public class BookDaoImpl implements BookDao{
	

	public static Map<Integer, Book> booksDB = new HashMap<Integer, Book>();
	
	
	Book book = new Book(123,"Thinking in Java - 3rd Edition", 180, "Bruce Eckel", "Core Java book");
	Book book1 = new Book(124,"Every Single Secret", 129, "Emily Carter", "A true psychological thriller that will leave you breathless");
	Book book2 = new Book(125,"The Dark of the Sun", 150, "Wilbur Smith", "The inner conflicts of a mismatched band of mercenaries threatens to derail an important mission");
	Book book3 = new Book(126,"Spring in action - 3rd Edition", 300, "Craig Walls", "Spring concept explaination");
	Book book4 = new Book(127,"Head First Java", 200, "Kathy Sierra & Bert Bates", "Core Java book - A learner's guide");
	Book book5 = new Book(128,"Gulliver's Travels", 250, "Jonathan Swift", "A satirical masterpiece that's never been out of print");
	Book book6 = new Book(129,"Frankenstein", 140, "Mary Shelley", "A masterpiece of horror and macabre");
	Book book7 = new Book(130,"The Moonstone", 260, "Wilkie Collins", "English Detective Novel");
	
	@Override
	public void addBooks() {
		booksDB.put(book.getBookId(), book);
		booksDB.put(book1.getBookId(), book1);
		booksDB.put(book2.getBookId(), book2);
		booksDB.put(book3.getBookId(), book3);
		booksDB.put(book4.getBookId(), book4);
		booksDB.put(book5.getBookId(), book5);
		booksDB.put(book6.getBookId(), book6);
		booksDB.put(book7.getBookId(), book7);
		
	}

	@Override
	public Collection<Book> viewAllBooks() {		
		return booksDB.values();
	}

	

	

	

}
