package CoreJava;

import java.util.Scanner;

public class Book {
	
	private String title;
	private String author;
	private int price;

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	public void discount(double percentage) {
		if(percentage>0 && percentage<=100) {
			double discAmount =(price*percentage)/100;
			price =price-(int)discAmount;
			System.out.println(percentage);
		}else {
			System.out.println("invalid Discount applied");
			
		}
		
	}
	
	public void bookDetails() {
		System.out.println("Book Name: " + title);
		System.out.println("Author of Book: "+author);
		System.out.println("Price of Book: "+price);
	}
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		Book book =new Book("CoreJava", "James Gosling", 599);
		System.out.println("Book Details: ");
		book.bookDetails();
		System.out.println("Discount Applied: ");
		book.discount(25);
		System.out.println("Price After Discount");
		book.bookDetails();
	}

}
