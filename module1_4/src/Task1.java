import java.util.Scanner;
import java.util.Random;

public class Task1 {

    public void generate(){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        String[] firstNames = {
                "John", "Jane", "Michael", "Emily", "Daniel",
                "Sophia", "David", "Olivia", "Matthew", "Emma",
                "Christopher", "Ava", "Andrew", "Isabella", "William",
                "Mia", "Ethan", "Abigail", "Alexander", "Grace"
        };

        String[] lastNames = {
                "Smith", "Johnson", "Williams", "Jones", "Brown",
                "Davis", "Miller", "Wilson", "Moore", "Taylor",
                "Anderson", "Thomas", "Jackson", "White", "Harris",
                "Martin", "Thompson", "Garcia", "Martinez", "Jones"
        };

        System.out.println("How many names do you want to generate? ");
        int amount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < amount; i++) {
            int r1 = rand.nextInt(20);
            int r2 = rand.nextInt(20);

            System.out.println(firstNames[r1] + " " + lastNames[r2]);
        }
    }
}
