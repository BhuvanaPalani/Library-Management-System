package library_package;

import java.util.Scanner;

//CLass
public class books {

 // Class data members
 genrebook genrebooks[] = new genrebook[50];

 
 public static int count;

 Scanner input = new Scanner(System.in);

 // Method 1
 //  To compare books
 public int compareBookObjects(book b1, book b2)
 {

     // If book name matches
     if (b1.bookName.equalsIgnoreCase(b2.bookName)) {

         // Printing book exists
         System.out.println(
             "Book of this Name Already Exists.");
         return 0;
     }

     // if book serial matches
     if (b1.sNo == b2.sNo) {

         // Print book exists
         System.out.println(
             "Book of this Serial No Already Exists.");

         return 0;
     }
     return 1;
 }

 // Method 2
 // To add book
 
 public void addGenreBook(genrebook b) {
	 for (int i = 0; i < count; i++) {

         if (this.compareBookObjects(b, this.genrebooks[i])
             == 0)
             return;
     }

     if (count < 50) {

    	 genrebooks[count] = b;
         count++;
     }
     else {

         System.out.println(
             "No Space to Add More Books.");
     }
 }

 // Method 3
 // To search book by serial number
 public void searchBySno()
 {

     // Display message
     System.out.println(
         "\t\t\t\tSEARCH BY SERIAL NUMBER\n");

     // Class data members
     int sNo;
     System.out.println("Enter Serial No of Book:");
     sNo = input.nextInt();

     int flag = 0;
     System.out.println(
         "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty\t\tGenre");

     for (int i = 0; i < count; i++) {
         if (sNo == genrebooks[i].sNo) {
             System.out.println(
                 genrebooks[i].sNo + "\t\t"
                 + genrebooks[i].bookName + "\t\t"
                 + genrebooks[i].authorName + "\t\t"
                 + genrebooks[i].bookQtyCopy + "\t\t"
                 + genrebooks[i].bookQty + "\t\t"
                 + genrebooks[i].bookType);
             flag++;
             return;
         }
     }
     if (flag == 0)
         System.out.println("No Book for Serial No "
                            + sNo + " Found.");
 }

 // Method 4
 // To search author by name
 public void searchByAuthorName()
 {

     // Display message
     System.out.println(
         "\t\t\t\tSEARCH BY AUTHOR'S NAME");

     input.nextLine();

     System.out.println("Enter Author Name:");
     String authorName = input.nextLine();

     int flag = 0;

     System.out.println(
         "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty\t\tGenre");

     for (int i = 0; i < count; i++) {

         // if author matches any of its book
         if (authorName.equalsIgnoreCase(
                 genrebooks[i].authorName)) {

             // Print below corresponding credentials
             System.out.println(
                 genrebooks[i].sNo + "\t\t"
                 + genrebooks[i].bookName + "\t\t"
                 + genrebooks[i].authorName + "\t\t"
                 + genrebooks[i].bookQtyCopy + "\t\t"
                 + genrebooks[i].bookQty + "\t\t"
                 + genrebooks[i].bookType);
             flag++;
         }
     }

     // Else no book matches for author
     if (flag == 0)
         System.out.println("No Books of " + authorName
                            + " Found.");
 }

 // Method 5
 // To display all books
 public void showAllBooks()
 {

     System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
     System.out.println(
         "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty\t\tGenre");
     for (int i = 0; i < count; i++) {

         System.out.println(
        		 genrebooks[i].sNo + "\t\t"
                         + genrebooks[i].bookName + "\t\t"
                         + genrebooks[i].authorName + "\t\t"
                         + genrebooks[i].bookQtyCopy + "\t\t"
                         + genrebooks[i].bookQty + "\t\t"
                         + genrebooks[i].bookType);
     }
 }

 // Method 6
 // To edit the book
 public void upgradeBookQty()
 {

     System.out.println(
         "\t\t\t\tUPGRADE QUANTITY OF A BOOK\n");
     
	  System.out.println("Enter Serial No of Book");

     int sNo = input.nextInt();

     for (int i = 0; i < count; i++) {

         if (sNo == genrebooks[i].sNo) {

             // Display message
             System.out.println(
                 "Enter No of Books to be Added:");

             int addingQty = input.nextInt();
             genrebooks[i].bookQty += addingQty;
             genrebooks[i].bookQtyCopy += addingQty;

             return;
         }
     }
 
 }

 // Method 7
 // To create menu
 public void dispMenuAdmin()
 {

     // Displaying menu
     System.out.println(
         "----------------------------------------------------------------------------------------------------------");
     System.out.println("WELCOME ADMINS");
     System.out.println(
             "----------------------------------------------------------------------------------------------------------");
     System.out.println("Press 1 to Add new Book.");
     System.out.println(
         "Press 2 to Upgrade Quantity of a Book.");
     System.out.println("Press 3 to Search a Book.");
     System.out.println("Press 4 to Show All Books.");
     System.out.println("Press 5 to Register Student.");
     System.out.println(
         "Press 6 to Show All Registered Students.");
     System.out.println("Press 7 to Check Out Book. ");
     System.out.println("Press 8 to Check In Book");
     System.out.println("Press 0 to Exit Application.");
     System.out.println(
         "-------------------------------------------------------------------------------------------------------");
 }
 
 public void dispMenuStudent()
 {

     // Displaying menu
     System.out.println(
         "----------------------------------------------------------------------------------------------------------");
     System.out.println("WELCOME STUDENTS");
     System.out.println(
             "----------------------------------------------------------------------------------------------------------");
     System.out.println("Press 1 to Search a Book.");
     System.out.println("Press 2 to Show All Books.");
     System.out.println("Press 3 to Check Out Book. ");
     System.out.println("Press 4 to Check In Book");
     System.out.println("Press 0 to Exit Application.");
     System.out.println(
         "-------------------------------------------------------------------------------------------------------");
 }

 // Method 8
 // To search the library
 public int isAvailable(int sNo)
 {

     for (int i = 0; i < count; i++) {
         if (sNo == genrebooks[i].sNo) {
             if (genrebooks[i].bookQtyCopy > 0) {

                 System.out.println(
                     "Book is Available.");
                 return i;
             }
             System.out.println("Book is Unavailable");
             return -1;
         }
     }

     System.out.println("No Book of Serial Number "
                        + " Available in Library.");
     return -1;
 }

 // Method 9
 // To remove the book from the library
 public genrebook checkOutBook()
 {

     System.out.println(
         "Enter Serial No of Book to be Checked Out.");
     int sNo = input.nextInt();

     int bookIndex = isAvailable(sNo);

     if (bookIndex != -1) {
         genrebooks[bookIndex].bookQtyCopy--;
         return genrebooks[bookIndex];
     }
     return null;
 }

 // Method 10
 // To add the Book to the Library
 public void checkInBook(book b)
 {
     for (int i = 0; i < count; i++) {
         if (b.equals(genrebooks[i])) {
             genrebooks[i].bookQtyCopy++;
             return;
         }
     }
 }
}
