package mod1;
import java.util.Scanner;

class Marks {
    int mark1, mark2, mark3;

    Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
 void displayResult() {
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}
public class MarksDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        int m3 = sc.nextInt();

        Marks student = new Marks(m1, m2, m3);
        student.displayResult();

        sc.close();
    }
}