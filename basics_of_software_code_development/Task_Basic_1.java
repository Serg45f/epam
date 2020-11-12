package basics_of_software_code_development;

import java.util.Scanner;

/**
 * Basic of software code development
 * Линейные программы
 * Задание 1. Найт значение функции: Z = ((a-3)*b/2)+c.
 */

public class Task_Basic_1 {
    public static void main(String[] args) {
        double z;
        double a,b,c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Find Z if Z = ((a-3)*b/2)+c");
        System.out.println();
        System.out.println("IMPOTENT: divider between digits MUST BE LIKE \",\" but NOT LIKE \".\"");
        System.out.println();
        System.out.println("Enter a:");
        a = scanner.nextDouble();
        System.out.println("Enter b:");
        b = scanner.nextDouble();
        System.out.println("Enter c:");
        c = scanner.nextDouble();


        z = ((a-3)*b/2)+c;

        System.out.println();
        System.out.println("Z = " + z);

    }
}
