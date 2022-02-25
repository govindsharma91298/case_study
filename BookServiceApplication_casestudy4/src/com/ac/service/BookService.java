package com.ac.service;

import com.ac.DAO.BookDAO;
import com.ac.bean.Book;

public class BookService {

	
	public int bookService(int bookId,String bookTitle,float bookPrice) {
		String grade=" ";
		if(bookPrice <= 300)
		 {
			 grade = "C";
		 }
		 else if(bookPrice <= 600)
		 {
			 grade = "B";
		 }
		 else
		 {
			 grade = "A";
		 }
		
		 BookDAO bDAO = new BookDAO(); 
		 Book book = new Book(); //7.
		 
		 book.setBookId(bookId);
		 book.setBookTitle(bookTitle);
		 book.setBookPrice(bookPrice);
		 book.setGrade(grade);
		 int updateResult = 0;
		 try
		 {
			 updateResult = bDAO.addBook(book); 
			 return updateResult; 
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.toString());
			 return 0;
		 }
		
		
		
		
		
	}
}
