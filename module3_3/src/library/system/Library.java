package library.system;

import library.model.Book;
import library.model.LibraryMember;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private boolean isBook = false;
    private ArrayList<Book> books;
    private ArrayList<LibraryMember> members;
    private Scanner s = new Scanner(System.in);

    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(String name, String title, String ISBN){
        Book book = new Book(name, title, ISBN);
        books.add(book);
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void addMember(String name){
        LibraryMember member = new LibraryMember(name);
        members.add(member);
    }

    public void addMember(LibraryMember member){
        members.add(member);
    }

    public boolean libraryHasBook(String name){
        for(Book b: books){
            if(b.getTitle().equals(name)){
                return true;
            }
        }
        return false;
    }

    public boolean memberHasBook(String name, String title){
        for(LibraryMember lm: members){
            if(lm.getName().equals(name)){
                for(Book b: lm.getBorrowed()){
                    if(b.getTitle().equals(title)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void borrowBooks(int amount, String name){
        int i = 0;
        for(LibraryMember lm: members){
            if(lm.getName().equals(name)){
                while(i < amount){
                    System.out.println("Hi " + lm.getName() + "! Give the name of the book you want to borrow.");
                    String title = s.nextLine();
                    if(libraryHasBook(title)){
                        i++;
                        System.out.println("Book '" + title + "' borrowed");
                        for(Book b: books){
                            if(b.getTitle().equals(title)){
                                lm.addBook(b);
                                books.remove(b);
                                break;
                            }
                        }
                    }else {
                        System.out.println("Library doesn't currently have book called " + title);
                    }
                }
            }
        }
    }

    public void returnBooks(int amount, String name){
        for(LibraryMember lm: members){
            if(lm.getName().equals(name)){
                for (int i = 0; i < amount; i++) {
                    System.out.println("Hi, " + lm.getName() + "! Give books name");
                    String title = s.nextLine();
                    if(memberHasBook(lm.getName(),title)){
                        i++;
                        System.out.println("Book '" + title + "' returned");
                        for(Book b: lm.getBorrowed()){
                            if(b.getTitle().equals(title)){
                                books.add(b);
                                lm.removeBook(b);
                                break;
                            }
                        }
                    }else {
                        System.out.println("Library doesn't currently have book called " + title);
                    }
                }
            }
        }
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.reserveBook(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.reserveBook(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReserved()) {
            System.out.println(book.getTitle());
        }
    }
}
