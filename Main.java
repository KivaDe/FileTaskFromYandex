import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int result = a + b;

        PrintWriter pw = new PrintWriter("output.txt");
        String text = String.valueOf(result);
        pw.write(text);
        pw.close();

    }
}