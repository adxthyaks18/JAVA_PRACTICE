package mod1;

import java.util.Scanner;

public class FibonacciWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        while (first <= limit) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}