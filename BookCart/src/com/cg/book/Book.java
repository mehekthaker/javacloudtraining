package com.cg.book;

public class Book {
	
	private int bookId;
	private String bookName;
	private double bookPrice;
	private String authorName;
	private String description;
	private int bookCount=1;
	

	
	public int getBookCount() {
		return bookCount;
	}


	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}


	public Book(int bookId, String bookName, double bookPrice, String authorName, String description) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.authorName = authorName;
		this.description = description;
	}


	public Book() {
		// TODO Auto-generated constructor stub
	}


	public int getBookId() {
		return bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public double getBookPrice() {
		return bookPrice;
	}
	
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}


	public String getAuthorName() {
		return authorName;
	}


	public String getDescription() {
		return description;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", authorName="
				+ authorName + ", description=" + description + ", bookCount=" + bookCount + "]";
	}



	


	
	
	
	
	

}
