import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public void solve(){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Give coefficient a: ");
        double a = Integer.parseInt(scanner.nextLine());
        System.out.println("Give coefficient b: ");
        double b = Integer.parseInt(scanner.nextLine());
        System.out.println("Give coefficient c: ");
        double c = Integer.parseInt(scanner.nextLine());

        double det = b * b - 4 *a * c;

        if(det <= 0){
            System.out.println("No real roots.");
        } else{
            double pos = (double) (-b + Math.sqrt(det)) / (2*a);
            double neg = (double) (-b - Math.sqrt(det)) / (2*a);

            System.out.println("Root 1: " + pos + ", Root 2: " + neg);
        }
    }
}
