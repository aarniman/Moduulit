import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("fibonacci.csv")) {
            fw.append("Index, Fibonacci Number\n");

            long a = 0, b = 1;

            for (int i = 0; i <= 100; i++) {
                fw.append(String.format("%d;%d\n", i, a));
                long temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println("Fibonacci sequence was saved in fibonacci.csv");

        } catch (IOException e){
            System.err.println(e);
        }
    }
}
