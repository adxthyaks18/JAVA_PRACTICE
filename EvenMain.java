package mainpackage;

import evenpackage.Even;
import java.util.Scanner;

public class EvenMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (Even.checkEven(n))
        {
            System.out.println(n + " is Even");
        }
        else
        {
            System.out.println(n + " is Odd");
        }

        sc.close();
    }
}
