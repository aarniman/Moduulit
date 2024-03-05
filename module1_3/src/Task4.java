import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public void test(){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int points = 0;
        System.out.println("You need 10 correct to pass. Good luck.");
        while(true){
            for(int i = 0; i < 10; i++){
                int ran1 = rand.nextInt(11);
                int ran2 = rand.nextInt(11);
                int ans = ran1 * ran2;

                System.out.println("What is " + ran1 + " times " + ran2 + "?");
                int guess = Integer.parseInt(scanner.nextLine());

                if(guess == ans){
                    System.out.println("That's correct!");
                    points++;
                } else{
                    System.out.println("Incorrect");
                }
            }
            if(points < 10){
                System.out.println("You got "+ points + "/10. You need 10/10 to pass. Try again!");
                points = 0;
                continue;
            } else{
                System.out.println("You got " + points + "/10. Congratulations! You passed!");
                break;
            }

        }
    }
}
