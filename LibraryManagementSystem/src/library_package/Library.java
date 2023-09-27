package library_package;

import java.util.Scanner;

//Class
public class Library {

 // Main driver method
 public static void main(String[] args)
 {
     // Creating object of Scanner class
     // to take input from user
     @SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);

     // Displaying menu
     System.out.println(
         "********************Welcome to the Library Management System!********************");
     System.out.println(
         "                  Select From The Following Options:               ");
     System.out.println(
         "**********************************************************************");

     // Creating object of book class
     books ob = new books();
     // Creating object of students class
     students obStudent = new students();

     genrebook a = new genrebook(1,"Bahubali","SSR",10,10,"Adventure");
	 ob.addGenreBook(a);
	 genrebook b = new genrebook(2,"Ponniyin Selvan","Kalki",10,10,"History");
	 ob.addGenreBook(b);
	 genrebook c = new genrebook(3,"Wings of fire","APJ",10,10,"Bio");
	 ob.addGenreBook(c);
     int choice;
     int searchChoice;

     // Creating menu
     // using do-while loop
     int op = 0;
	 System.out.println("1- Admin Log in");
	 System.out.println("2- Student Log in");
	 System.out.println("3- Exit");
	 op = input.nextInt();
	 if(op == 1) {
	     do {
	
	         ob.dispMenuAdmin();
	         choice = input.nextInt();
	
	         // Switch case
	         switch (choice) {
	
	             // Case
	         case 1:
            	 genrebook ab = new genrebook();
            	 ob.addGenreBook(ab);
	             break;
	             // Case
	         case 2:
	             ob.upgradeBookQty();
	             break;
	
	         // Case
	         case 3:
	
	             System.out.println(
	                 " press 1 to Search with Book Serial No.");
	             System.out.println(
	                 " Press 2 to Search with Book's Author Name.");
	             searchChoice = input.nextInt();
	
	             // Nested switch
	             switch (searchChoice) {
	
	                 // Case
	             case 1:
	                 ob.searchBySno();
	                 break;
	
	                 // Case
	             case 2:
	                 ob.searchByAuthorName();
	             }
	             break;
	
	             // Case
	         case 4:
	             ob.showAllBooks();
	             break;
	
	             // Case
	         case 5:
	             Student s = new Student();
	             obStudent.addStudent(s);
	             break;
	
	             // Case
	         case 6:
	             obStudent.showAllStudents();
	             break;
	
	             // Case
	         case 7:
	             obStudent.checkOutBook(ob);
	             break;
	
	             // Case
	         case 8:
	             obStudent.checkInBook(ob);
	             break;
	             
	             // Case
	         case 0:
	        	 System.out.println("You have been logged out...!");
	             break;
	
	             // Default case that will execute for sure
	             // if above cases does not match
	         default:
	
	             // Print statement
	             System.out.println("ENTER BETWEEN 0 TO 8.");
	         }
	
	     }
	 

	     // Checking condition at last where we are
	     // checking case entered value is not zero
	     while (choice != 0);
	 } else if(op == 2) {
		 do {
				
	         ob.dispMenuStudent();
	         choice = input.nextInt();
	
	         // Switch case
	         switch (choice) {	
	         // Case
	         case 1:
	
	             System.out.println(
	                 " press 1 to Search with Book Serial No.");
	             System.out.println(
	                 " Press 2 to Search with Book's Author Name.");
	             searchChoice = input.nextInt();
	
	             // Nested switch
	             switch (searchChoice) {
	
	                 // Case
	             case 1:
	                 ob.searchBySno();
	                 break;
	
	                 // Case
	             case 2:
	                 ob.searchByAuthorName();
	             }
	             break;
	
	             // Case
	         case 2:
	             ob.showAllBooks();
	             break;
	
	             // Case
	         case 3:
	             obStudent.checkOutBook(ob);
	             break;
	
	             // Case
	         case 4:
	             obStudent.checkInBook(ob);
	             break;
	             
	          // Case
	         case 0:
	        	 System.out.println("You have been logged out...!");
	             break;
	
	             // Default case that will execute for sure
	             // if above cases does not match
	         default:
	
	             // Print statement
	             System.out.println("ENTER BETWEEN 0 TO 4.");
	         }
	
	     }
	 

	     // Checking condition at last where we are
	     // checking case entered value is not zero
	     while (choice != 0);
	 }else {
		 System.out.println("Exit Program");
		 return;
	 }
 }
}
