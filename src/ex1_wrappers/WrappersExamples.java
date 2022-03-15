package ex1_wrappers;

import java.util.ArrayList;

public class WrappersExamples {
    public static void main(String[] args) {
        Integer a = 1;
//        Integer b = new Integer(1);
        Integer b1 = Integer.valueOf(1);
        System.out.println(b1);
        System.out.println(b1.floatValue());
        int b2 = 1;
        float f1;
        f1 = b2;
        float f2 = 3.5f;
        int b3 = (int) f2;
        System.out.println(b3);

        Double c = 2.5;
        Float d = 3.2f;
//        d = c;
        Integer a2 = d.intValue();
        Character e = 'a';
        Character e1 = 97-32;
        Boolean f = true;

        System.out.println(a instanceof Object);
//        System.out.println(b2 instanceof Object);
//        System.out.println(a instanceof Float);

        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList<int> list2 = new ArrayList<int>();

        //Z wykorzystaniem metod dostępnych w wrapperach wydrukuj
        // - zmienną 'a' jako liczbę zmiennoprzecinkową
        // - zmienną 'e1' jako znak
        // - zmienną 'd' jako liczbę całkowitą
        System.out.println("Wyświetlam Integer jako zmiennoprzecinkowa: " + a.doubleValue());
        System.out.println("Wyświetlam Character decymalny jako znak: " + e1);
        System.out.println("Wyświetlam Float jako int " + d.intValue());
    }
}
