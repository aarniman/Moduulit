import java.util.Scanner;

public class Task3 {

    public void prime(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give first number: ");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Give second number: ");
        int second = Integer.parseInt(scanner.nextLine());

        for(int i = first; i <= second; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }

    }

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
