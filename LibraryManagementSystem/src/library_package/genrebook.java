package library_package;

import java.util.Scanner;

public class genrebook extends book {
	public genrebook(int sNo, String bookName, String authorName, int bookQty, int bookQtyCopy,String bookType ) {
		super(sNo, bookName, authorName, bookQty, bookQtyCopy);
		this.bookType = bookType;
	}
	public String bookType;
	
	 Scanner input = new Scanner(System.in);
	public genrebook()
	 {
	     System.out.println("Enter Genre of book:");
	     this.bookType = input.nextLine();
	 }
}
