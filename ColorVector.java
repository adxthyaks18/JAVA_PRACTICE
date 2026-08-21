package mod2;
import java.util.Vector;

public class ColorVector {
    public static void main(String[] args) {
        Vector<String> colors = new Vector<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        colors.remove("Green");

        System.out.println("Vector after removal: " + colors);
    }
}