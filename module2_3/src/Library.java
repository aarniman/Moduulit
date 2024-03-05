import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void addUser(User user){
        users.add(user);
    }

    public void displayUsers(){
        for(User u: users){
            System.out.println("Name: " + u.getName() + ", Age: " + u.getAge());
        }
    }

    public void displayBooks(){
        System.out.println("Library Catalog:");
        int count = 1;
        for(Book i: books){
            System.out.println(count + ". Title: " + i.getTitle() + ", Author: " + i.getAuthor() + ", Year:" + i.getPublicationYear());
            count++;
        }
        System.out.println();
    }

    public void findBooksByAuthor(String author){
        System.out.println("Books by Author: " + author + ":");
        for(Book i: books){
            if(i.getAuthor().equals(author)){
                System.out.println(" Title: " + i.getTitle() + ", Year:" + i.getPublicationYear());
            }
        }
        System.out.println();
    }

    public void getAverageBookRating(){
        double sum = 0;
        int count = 1;
        for(Book b: books){
            if(b.getRating() < 0){
                sum += sum + b.getRating();
                count++;
            }
        }
        double avg = sum / count;
        System.out.println("Average rating of all of the books in the library is: " + avg);
    }

    public Book getMostReviewedBook() {
        int size = 0;
        Book book = null;
        for (Book b : books) {
            if (b.getReview().size() > size) {
                size = b.getReview().size();
                book = b;
            }
        }
        return book;
    }

    public boolean isBookAvailable(String title){
        for(Book b: books){
            if(b.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    public void borrowBook(String title){
        if(isBookAvailable(title)){
            for(Book b: books){
                if(b.getTitle().equals(title)){
                    books.remove(b);
                    System.out.println("Kirja " + title + " lainattu.");
                    break;
                }
            }
        }
        System.out.println("Kirjaa ei löytynyt");
    }

    public void returnBook(Book book){
        if(!this.books.equals(book)){
            System.out.println("Kirja " + book.getTitle() + " palautettu.");
            books.add(book);
        }
    }

    public void usersBorrowedBooks(String name){
        for(User u: users){
            if(u.getName().equals(name)){
                u.listBorrowed();
            }
        }
    }
}
