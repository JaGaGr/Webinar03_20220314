package ex3_operators_examples;

public class LogicalOperatorsExamples {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 0;

        System.out.println((i < j) && (i < k));

        System.out.println((i < j) || (i < k));

        boolean b = true;
        System.out.println(!b);
    }
}
