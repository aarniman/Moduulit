public class Main {
    public static void main(String[] args) {
        Library l = new Library();
        Book b1 = new Book("1984", "George Orwell", 1949);
        Book b2 = new Book("Lord of the Flies", "William Golding", 1954);
        Book b3 = new Book("Lord of the Rings: The Fellowship of the Ring", "J. R. R. Tolkien", 1954);
        Book b4 = new Book("Lord of the Rings: Two Towers", "J. R. R. Tolkien", 1954);
        Book b5 = new Book("Lord of the Rings: Return of the King", "J. R. R. Tolkien", 1955);
        Book b6 = new Book("Harry Potter and the Philosophers Stone", "J. K. Rowling", 1997);

        l.addBook(b1);
        l.addBook(b2);
        l.addBook(b3);
        l.addBook(b4);
        l.addBook(b5);
        l.addBook(b6);

        l.displayBooks();
        l.findBooksByAuthor("J. R. R. Tolkien");

        l.isBookAvailable("1984");
        l.borrowBook("1984");
        l.isBookAvailable("1984");
        l.returnBook(b1);
    }
}