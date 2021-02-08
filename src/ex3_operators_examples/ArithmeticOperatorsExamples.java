package ex3_operators_examples;

public class ArithmeticOperatorsExamples {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 0, l = 0;
        
        k = i + j;
        System.out.println("Suma = " + k);
        k = j - i;
        System.out.println("Różnica = " + k);

        k = 0;
        System.out.println(k++); //postinkrementacja
        k = 0;
        System.out.println(++k); //preinkrementacja
        k = 2;
        System.out.println(k--); //postdekrementacja
        k = 2;
        System.out.println(--k); //predekrementacja

        k = i * j;
        System.out.println("Iloczyn = " + k);

        k = j / i;
        System.out.println("Iloraz = " + k);

        k = i % j;
        System.out.println("Reszta z dzielenia = " + k);

    }
}
