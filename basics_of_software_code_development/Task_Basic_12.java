package basics_of_software_code_development;

import java.util.Scanner;

/**
 * Напишите программу,  где пользователь вводит любое целое число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 *
 *
 */
public class Task_Basic_12 {
    public static void main(String[] args) {
        int number;
        long res=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое число:");
        number = sc.nextInt();
        for(int i = 1; i<number;i++)res+=i;
        System.out.println(res);

    }
}
