import library.model.Book;
import library.model.LibraryMember;
import library.system.Library;

public class Main {
    public static void main(String[] args) {

        Library l = new Library();
        LibraryMember aarni = new LibraryMember("Aarni");
        LibraryMember abdu = new LibraryMember("Abdu");
        LibraryMember kaspar = new LibraryMember("Kaspar");
        LibraryMember arttu = new LibraryMember("Arttu");
        LibraryMember tatu = new LibraryMember("Tatu");

        l.addMember(aarni);
        l.addMember(abdu);
        l.addMember(kaspar);
        l.addMember(arttu);
        l.addMember(tatu);

        Book orvell = new Book("1984", "George Orwell", "9781234567897");
        Book flies = new Book("Lord of the Flies", "William Golding", "7082371259414");
        Book lotr1 = new Book("Lord of the Rings: The Fellowship of the Ring", "J. R. R. Tolkien", "5664023362980");
        Book lotr2 = new Book("Lord of the Rings: Two Towers", "J. R. R. Tolkien", "0041894175878");
        Book lotr3 = new Book("Lord of the Rings: Return of the King", "J. R. R. Tolkien", "7518520136457");
        Book potter1 = new Book("Harry Potter and the Philosophers Stone", "J. K. Rowling", "1531264038465");

        l.addBook(orvell);
        l.addBook(flies);
        l.addBook(lotr1);
        l.addBook(lotr2);
        l.addBook(lotr3);
        l.addBook(potter1);

        l.borrowBooks(2, "Aarni");
        l.borrowBooks(1, "Arttu");
        l.returnBooks(2, "Aarni");

        l.reserveBook(aarni, lotr3);
        l.reserveBook(arttu, lotr3);
        l.cancelReservation(aarni, lotr3);
    }
}