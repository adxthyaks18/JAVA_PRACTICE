package mod1;

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Odd numbers from 1 to " + n + " are:");

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0)
                continue;

            System.out.print(i + " ");
        }

        sc.close();
    }
}