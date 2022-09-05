package com.question4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
	
	//instance variable
	List<Book> bookList = new ArrayList<>();
	
	
	//this method is to add the book object to the booklist.
	public void addBook(Book book)
	{
		
		bookList.add(book);
		
	}
	
	
	//this method is to return true if the booklist is empty else return false.
	public boolean isEmpty()
	{
		return bookList.isEmpty();
	}
	
	//this method is to return the list of books maintained in the library.
	public List<Book> viewAllBooks()
	{
		return bookList;
	}
	
	//this method is to return a list of books written by the author passed as an argument
	public List<Book> viewBooksByAuthor(String author)
	{
		ArrayList<Book> result = new ArrayList<>();
		
		Iterator iter = bookList.iterator();
		
		while(iter.hasNext())
		{
			Book b =(Book)iter.next();
			if(b.getAuthor().equalsIgnoreCase(author)) {
				result.add(b);
			}
		}
		
		return result;
	}
	
	//this method is to return the count of books with the name passed as an argument
	public int countNoOfBook(String bookName)
	{
		int count=0;
		Iterator iter = bookList.iterator();
		while(iter.hasNext())
		{
			Book book = (Book)iter.next();
			if(book.getBookName().equalsIgnoreCase(bookName))
			{
				count++;
			}
		}
		return count;
	}
}
