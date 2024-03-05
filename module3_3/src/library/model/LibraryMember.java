package library.model;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class LibraryMember {
    private String name;
    private int ID;
    private static AtomicInteger count = new AtomicInteger(0);
    private ArrayList<Book> borrowed, reserved;

    public LibraryMember(String name){
        this.name = name;
        this.ID = count.incrementAndGet();
        borrowed = new ArrayList<>();
        reserved = new ArrayList<>();
    }

    public void addBook(Book book){
        this.borrowed.add(book);
    }

    public void removeBook(Book book){
        this.borrowed.remove(book);
    }

    public void addReservedBook(Book book){
        this.reserved.add(book);
    }

    public void removeReservedBook(Book book){
        this.reserved.remove(book);
    }

    public boolean hasReservedBook(Book book){
        return this.reserved.contains(book);
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public ArrayList<Book> getBorrowed() {
        return borrowed;
    }

    public ArrayList<Book> getReserved() {
        return reserved;
    }
}
