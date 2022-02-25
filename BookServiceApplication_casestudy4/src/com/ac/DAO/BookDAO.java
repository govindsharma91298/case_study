package com.ac.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ac.bean.Book;

public class BookDAO {
	 public int addBook(Book book) //10.
	  {	  Connection con = null;
		  PreparedStatement bstmt = null;
		  try
		  {  
			  con=BookDB.getConnection(); 
			  
			  String ins_str = "insert into product values(?,?,?,?)";
			 
			  bstmt = con.prepareStatement(ins_str);
			  bstmt.setInt(1,book.getBookId());
			  bstmt.setString(2,book.getBookTitle());
			  bstmt.setFloat(3,book.getBookPrice());
			  bstmt.setString(4,book.getGrade());
			  int updateCount = bstmt.executeUpdate();  
			       //17.
			  con.close();
			  return updateCount; //18
		  }
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			  return 0;
		  }
	  }
	   
	  public ArrayList getBookDetailsById(int bookId)
				throws Exception
				{
					Connection con = null;
					PreparedStatement bstmt = null;
					ResultSet rs = null;
					
					con = BookDB.getConnection();
					
			    String sel_str ="Select bookTitle,bookPrice from book where bookId=?";
					  
					  
					  bstmt = con.prepareStatement(sel_str);
					  bstmt.setInt(1,bookId);
					  rs = bstmt.executeQuery();
					  
					  ArrayList result = new ArrayList();
					  if(rs.next())
					  {
						  result.add(rs.getString(1));
						  result.add(rs.getString(2));
						  
					  }
					  else
					  {
						  result.add("Invalid Id");
					  }
					  return result;
					
				}
}




