package library.model;

public class Book {
    private String title, author, ISBN;
    private boolean reserved;

    public Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.reserved = false;
    }

    public void reserveBook(boolean status){
        this.reserved = status;
    }

    public void unReserve(){
        this.reserved = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isReserved() {
        return reserved;
    }
}
