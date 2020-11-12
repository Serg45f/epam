package basics_of_software_code_development;

import java.util.Scanner;

/**
 * Basic of software code development
 * Линейные программы
 * Задание 2. Вычислить значение выражения по формуле (все переменные принимают дейсвительные значения):
 * (b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a-Math.pow(a,3)*c+Math.pow(b,-2)
 */
public class Task_Basic_2 {
    public static void main(String[] args) {

        double r=0,a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Find result of (b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a-Math.pow(a,3)*c+Math.pow(b,-2)");
        System.out.println();
        System.out.println("IMPOTENT: divider between digits MUST BE LIKE \",\" but NOT LIKE \".\"");
        System.out.println();

        do{
            System.out.println("Enter a:");
            a = sc.nextDouble();
            if(a==0) System.out.println("\"a\" is in denominator, so \"a\" cannot be 0. Try again, please.");
        }while(a==0);

        System.out.println("Enter b:");
        b = sc.nextDouble();
        System.out.println("Enter c:");
        c = sc.nextDouble();

        if(a!=0) r=(b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a-Math.pow(a,3)*c+Math.pow(b,-2);
        else System.out.println("You cannot divide by 0");
        System.out.println("Result is "+r);

    }
}
