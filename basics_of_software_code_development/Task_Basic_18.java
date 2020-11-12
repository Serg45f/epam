package basics_of_software_code_development;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 *
 */
public class Task_Basic_18 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите начало интервала m:");
        m = sc.nextInt();
        System.out.println("Введите конец интервала n:");
        n = sc.nextInt();

        for(int i = m; i<=n;i++){
            for(int j = 2;j<i;j++){
                if(i%j==0) System.out.println(i + " - " + j);
            }
        }
    }
}
