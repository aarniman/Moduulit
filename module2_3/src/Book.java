import java.util.ArrayList;

public class Book {
    private String title, author;
    private int publicationYear;
    private double rating = -1;
    private ArrayList<String> review;

    public Book(String name, String author, int year){
        this.title = name;
        this.author = author;
        this.publicationYear = year;
        review = new ArrayList<>();
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public void addReview(String review){
        this.review.add(review);
    }

    public double getRating(){
        return this.rating;
    }

    public ArrayList<String> getReview() {
        return this.review;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }
}
