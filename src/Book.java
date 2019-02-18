import java.util.*;
import java.awt.*;


public class Book {

	
	
	
	private String BookName ; 
	private double price ; 
	private int count ; 
	
	 public Book(String BookName, double price , int count) {
	        this.BookName=BookName;
	        this.count = count; 
	        this.price = price ; 
	 }
	
	 public Book() {
	        this.BookName=null;
	        this.count = 0; 
	        this.price = 0; 
	 }
	

	 public String getBookName() { return this.BookName;}
     public void setBookName(String newName) {this.BookName = newName;	  }

	 public int getcount() { return this.count;}
     public void setcount(int count) {this.count = count;	  }


	 public double getprice() { return this.price;}
     public void setprice(double price) {this.price = price;	  }

		
	
}
