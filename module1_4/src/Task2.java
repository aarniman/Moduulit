import java.util.Scanner;

public class Task2 {

    public void sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int first = 0;
        int last = 0;

        System.out.println("Enter integers into the array: ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            int num = i+1;
            System.out.print("Enter integer " + num + ": ");
            int n = Integer.parseInt(scanner.nextLine());
            array[i] = n;
        }
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];

                if(sum > max){
                    max = sum;
                    first = i;
                    last = j;
                }
            }

        }
        System.out.println();
        first = first + 1;
        last = last + 1;
        System.out.println("Maximum sum: " + max);
        System.out.println("Integers: " + first + "-" + last);

    }
}
