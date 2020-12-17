/* This is a library, You can add new books here,
        you can see all books, you can issue books from here.
 */
package com.company;

import java.util.Scanner;

import java.util.Arrays;

import static java.lang.System.exit;

public class Library {
    Scanner s = new Scanner(System.in);
    String [] books = new String[100];
    String [] issued_books = new String[100];
    int length=0,size=0;
    public Library(){                                   //This Constructor will display greeting text and choices
        System.out.println("Hello Bibilophile!!");
        System.out.print("1- Add new book\n2- Display all books\n3- Issue book\n4- Return book\n5- Exit\n");
    }
    public void addBook() {                                 //This method will add new books in library
        int val = 1;
        while (val == 1) {
            System.out.print("Enter book name:-");
            books[length] = s.nextLine();
            length++;
            System.out.print("Want to add another one(1/0):-");
            val = s.nextInt();
            s.nextLine();
        }
    }

    public void showAvailableBooks(){                                //This method shows all the books in the library
        if(length == 0){
            System.out.println("No books in the library yet!!");
            return;
        }
        int i;
        for(i=0;i<length;i++){
            System.out.printf("%d : %s\n",i+1,books[i]);
        }
    }
    public void issueBook(){                                      //This method helps to issue books
        showAvailableBooks();
        if(length == 0)
            return;
        String book_name;
        System.out.print("Enter book name which you want to issue: ");
        book_name = s.nextLine();
        if(Arrays.asList(books).contains(book_name)){
            issued_books[size] = book_name;
            size++;
            System.out.println("Issued successfuly!!");
        }
        else{
            System.out.println("Sorry this book is not available!!");
        }
    }
    public void returnBook(){                                            //This method helps to return package
        if(size == 0){
            System.out.println("No books issued yet!!1");
            return;
        }
        System.out.print("Enter book name which you want to return: ");
        String book_name = s.nextLine();
        if(Arrays.asList(issued_books).contains(book_name)){
            System.out.println("Thanks for returning on time!!");
        }
        else{
            System.out.println("This book is not issued by anyone");
        }
    }

                        //Main method

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Library Librarian = new Library();
        while(true){
            System.out.print("Enter your choice: ");
            int choice = S.nextInt();
            switch (choice){
                case 1:
                    Librarian.addBook();
                    break;
                case 2:
                    Librarian.showAvailableBooks();
                    break;
                case 3:
                    Librarian.issueBook();
                    break;
                case 4:
                    Librarian.returnBook();
                    break;
                case 5:
                    exit(0);
                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
}

