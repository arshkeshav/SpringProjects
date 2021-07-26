package com.spring;

public class Book {
	private int bookId;
	private String bookName;
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public Book() {}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
}
