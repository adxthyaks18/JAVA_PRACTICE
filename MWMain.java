package mainpackage;

import pack1.Man;
import pack2.Woman;

public class MWMain
{
    public static void main(String[] args)
    {
        Man m = new Man("Smith", 40);
        Woman w = new Woman("Jane", 35);

        m.displayMe();
        w.displayMe();
    }
}
