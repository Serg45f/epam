package basics_of_software_code_development;

import java.util.Scanner;

/**
 * Basic of software code development
 * Линейные программы
 * Задание 1. Вычислить значение выражения по формуле (все переменные принимают дейсвительные значения):
 * (sin(x)+cos(y))/(cos(x)-sin(y))*tan(x*y)
 */
public class Task_Basic_3 {
    public static void main(String[] args) {

        double r=0, x,y;



        Scanner sc = new Scanner(System.in);

        System.out.println("Find result of (sin(x)+cos(y))/(cos(x)-sin(y))*tan(x*y)");
        System.out.println();
        System.out.println("IMPOTENT: divider between digits MUST BE LIKE \",\" but NOT LIKE \".\"");
        System.out.println();

        do{
            System.out.println("Enter x degrees:");
            x = Math.toRadians(sc.nextDouble());

            System.out.println("Enter y degrees:");
            y = Math.toRadians(sc.nextDouble());


            if(((float)Math.cos(x)-(float)Math.sin(y))==0)
                System.out.println("Please change \"x\" or \"y\" value because of cos(x)-sin(y) = "+(float)Math.cos(x)+" - "+(float)Math.sin(y)+" = "+((float)Math.cos(x)-(float)Math.sin(y))+ " but cannot be zero.");
        }while(((float)Math.cos(x)-(float)Math.sin(y))==0);


        if(((float)Math.cos(x)-(float)Math.sin(y))!=0) r=(Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)*Math.tan(x*y));
        else System.out.println("You cannot divide by 0");
        System.out.println("Result is "+r);
        System.out.println("cos(x)-sin(y) = "+(float)Math.cos(x)+" - "+(float)Math.sin(y)+" = "+((float)Math.cos(x)-(float)Math.sin(y)));

    }

}
