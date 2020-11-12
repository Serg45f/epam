package basics_of_software_code_development;

/**
 * Найти сумму квадратов первых 100 чисел
 *
 *
 */
public class Task_Basic_14 {
    public static void main(String[] args) {
        long res=0;
        for (int i=1;i<=100;i++)res+=i*i;
        System.out.println(res);
    }
}
