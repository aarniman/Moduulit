import java.util.Scanner;

public class Task2 {
    public void binary(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a binary number");
        String binary = scanner.nextLine();

        double sum = 0;
        int j = 0;
        for(int i = binary.length()-1; i >= 0; i--){
            char bit = binary.charAt(i);
            int val = Character.getNumericValue(bit);
            if(binary.charAt(i) == '1'){
                sum += val * Math.pow(2, j);
            }
            j++;
        }
        int dec = (int) sum;
        System.out.println(dec);
    }
}
