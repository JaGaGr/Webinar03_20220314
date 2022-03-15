package ex3_operators_examples;

public class AssignmentOperatorsExample {
    public static void main(String[] args) {
        int i = 1, j = 2, res = 0;

        res = i + j;

        /*
            Sprawdź wynik dla pozostałych operatorów
                +=
                -=
                *=
                /=
         */
        res = 0;
        res += j;
        System.out.println(res);
        res += 1; //odpowiednik res++;
        System.out.println(res);
        System.out.println(res += 1);
//        Starajcie się unikać podobnego wykorzystania (przekazania do metody z przypisaniem nowej wartości)
//        Warto rozbić to na 2 linijki - przypisanie i osobno przekazanie do metody. Taka forma zwiększa czytelność
        System.out.println(res);

        res -= 6;
        System.out.println(res);
    }
}
