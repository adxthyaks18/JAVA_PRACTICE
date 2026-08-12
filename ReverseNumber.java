package mod1;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        for (; num > 0; num = num / 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Reversed Number = " + reverse);

        sc.close();
    }
}