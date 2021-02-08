package ex1_wrappers;

import java.util.ArrayList;

public class WrappersExamples {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = new Integer(1);

        Double c = 2.5;
        Float d = 3.2f;
        Character e = 'a';
        Character e1 = 97-32;
        Boolean f = true;

        System.out.println(a instanceof Object);
        //System.out.println(i instanceof Object);

        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList<int> list2 = new ArrayList<int>();

        //Z wykorzystaniem metod dostępnych w wrapperach wydrukuj
        // - zmienną 'a' jako liczbę zmiennoprzecinkową
        // - zmienną 'e1' jako znak
        // - zmienną 'd' jako liczbę całkowitą
    }
}
