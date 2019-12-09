package MyPractice;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter a number here: ");
        Scanner scanner = new Scanner(System.in);
        Integer in = scanner.nextInt();
        int n = 12;
        for (int i = 1; i <= n; i++){
            int tables = i * in;
            System.out.println(i + " * " + n + " = " + tables);

        }
    }
}
