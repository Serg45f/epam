package basics_of_software_code_development;

import java.util.Scanner;

/**
 * Basic of software code development
 * Линейные программы
 * Задание 6. Для данной области сотавить линейную программу, которая печатает true,
 * если точка с координатами (x,y) принадлежит закрашенной обласи, и false - в противном случае.
 */

public class Task_Basic_6 {
    public static void main(String[] args) {

        int[][] field = new int[8][9];
        int x, y;
        boolean res = false;
        String choise;

        field[0] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        field[1] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        field[2] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        field[3] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        field[4] = new int[]{0, 0, 1, 1, 1, 1, 1, 0, 0};
        field[5] = new int[]{0, 0, 1, 1, 1, 1, 1, 0, 0};
        field[6] = new int[]{0, 0, 1, 1, 1, 1, 1, 0, 0};
        field[7] = new int[]{0, 0, 1, 1, 1, 1, 1, 0, 0};

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter x coordinate:");
            x = sc.nextInt();
            System.out.println("Enter y coordinate:");
            y = sc.nextInt();

            for (int i = 7; i >= 0; i--) {
                for (int j = 8; j >= 0; j--) {
                    if (x == j - 4 && y == i - 3 && field[i][j] == 1) {
                        System.out.println("Point with coordinates x = " + x + ", y = " + y + " belongs to the given range");
                        res = true;
                        break;
                    }
                }
            }
            if (!res) {
                System.out.println("Point with coordinates x = " + x + ", y = " + y + " is out of the given range");
            }

            res = false;

            do {
                System.out.println("One more point? (y:n)");
                choise = sc.next();

                if (choise.equals("n") || choise.equals("y")) {
                    break;
                } else System.out.println("Please choose \"y\" or \"n\"");
            } while (!choise.equals("n"));

            if (choise.equals("n")) break;
        }
    }

}
