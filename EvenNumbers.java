package mod1;

public class EvenNumbers {

    public static void main(String[] args) {

        int i = 2;

        System.out.println("Even numbers between 1 and 20 are:");

        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= 20);
    }
}