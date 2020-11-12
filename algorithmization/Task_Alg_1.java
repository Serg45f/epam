package algorithmization;

/**
 * В массив А[N] занесены натуральные числа.
 * Найти сумму тех элемнтов, которые кратны данному К.
 */
public class Task_Alg_1 {
    public static void main(String[] args) {
        int k = 5;
        int[] a = {1, 5, 25, 48, 65, 45, 42, 36, 854};

        System.out.println(sum(a,k));
    }

    public static int sum(int[] a, int k) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) sum += a[i];
        }
        return sum;
    }

}
