package com.company;

import java.util.ArrayList;

class Book{
    public  String name,author;
    public Book(String name,String author){
        this.name=name;
        this.author=author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
class MyLibrary{
    public ArrayList<Book> books;

    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }
    public  void addBook(Book book){
        System.out.println("The Book has been added to the Library");
        System.out.println("Book Names:-");
        this.books.add(book);
    }
    public  void issueBook(Book book,String issueTo){
        System.out.println("The Book has been issued from the library to "+issueTo);
        System.out.println("Available Books:-");
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The Book has been returned ");
        System.out.println("Total Books:-  ");
        this.books.add(b);
    }
}
public class Library_Management {
    public static void main(String[] args) {
        ArrayList<Book> bk=new ArrayList<>();
        Book b1=new Book("C++","Denis Richie");
        bk.add(b1);
        Book b2=new Book("Mathematics","RD Sharma");
        bk.add(b2);

        MyLibrary l=new MyLibrary(bk);
        l.addBook(new Book("JAVA","Joshua Bloch"));
        System.out.println(l.books);
        l.issueBook(b2,"Harry");
        System.out.println(l.books);
        l.returnBook(b2);
        System.out.println(l.books);
    }
}
