package com.ac.Ui;

import java.util.Scanner;

import com.ac.service.BookService;

public class BookUi {

	public static void main(String[] args) {
		int BookId=0;
		String BookTitle="";
		float BookPrice=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Book Id");
			BookId = s.nextInt();
			System.out.println("Enter Book Titile");
			BookTitle = s.next();	
			System.out.println("Enter Book price");
			BookPrice = s.nextFloat();
			BookService bookService1 = new BookService(); //2.
			   int updateCount = bookService1.bookService(BookId, BookTitle, BookPrice); 
	  
			System.out.println("inserted "+updateCount+" record   Success");
	}


	}


