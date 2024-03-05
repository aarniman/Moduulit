import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowed;

    public User(String name, int age){
        this.name = name;
        this.age = age;
        borrowed = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Book> getBorrowed() {
        return borrowed;
    }

    public void listBorrowed(){
        for(Book b: borrowed){
            System.out.println(b.getTitle());
        }
    }
}
