import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public void dublicate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter integers into the array: ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int num = i+1;
            System.out.print("Enter integer " + num + ": ");
            int n = Integer.parseInt(scanner.nextLine());
            array[i] = n;
        }

        int[] dub = new int[array.length];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if(array[i] == dub[j]){
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate){
                dub[count] = array[i];
                count++;
            }
        }

        System.out.println("Array without duplicates: ");
        for(int i = 0; i < dub.length; i++){
            System.out.print(dub[i] + " ");
        }
    }
}
