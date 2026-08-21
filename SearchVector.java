import java.util.Scanner;
import java.util.Vector;

public class SearchVector {
    public static void main(String[] args) {
        Vector<String> items = new Vector<>();
        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Marker");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name to search: ");
        String search = sc.nextLine();

        if (items.contains(search)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

        sc.close();
    }
}