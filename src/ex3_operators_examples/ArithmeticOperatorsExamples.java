package ex3_operators_examples;

public class ArithmeticOperatorsExamples {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 0, l = 0;
        
        k = i + j;
        System.out.println("Suma = " + k);
        k = j - i;
        System.out.println("Różnica = " + k);

        k = 0;
        System.out.println(k++); //postinkrementacja - wartość zwiększana dopiero po wykorzystaniu zmiennej
        System.out.println(k);
        k = 0;
        System.out.println(k);
        System.out.println(++k); //preinkrementacja - wartość zwiększana przed wykorzystaniem zmiennej
        System.out.println(k);
        k = 2;
        System.out.println(k);
        System.out.println(k--); //postdekrementacja - wartość zmniejszana dopiero po wykorzystaniu zmiennej
        System.out.println(k);
        k = 2;
        System.out.println(k);
        System.out.println(--k); //predekrementacja - wartość zmniejszana przed wykorzystaniem zmiennej
        System.out.println(k);

//        System.out.println(j/l);
//        powyższa linijka wygeneruje runtime exception - błąd w trakcie wykonywania aplikacji - dzielenie przez zero

        k = i * j;
        System.out.println("Iloczyn = " + k);
        System.out.println("Iloczyn = " + i * j);

        k = j / i;
        System.out.println("Iloraz = " + k);
        double k1 = 5 / 2;
        System.out.println(k1);
//        Dzielenie dwóch zmiennych typu int zwróci liczbę całkowitą, nawet jeśli przypiszemy ją do zmiennej typu double
//        jeśli chcemy uzyskać w wyniku wartość zmiennoprzecinkową przynajmniej jedna z liczb musi być zmiennoprzecinkowa

        k = i % j;
        System.out.println("Reszta z dzielenia = " + k);


    }
}
