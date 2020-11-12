package basics_of_software_code_development;

import java.util.Scanner;

/**
 * Basic of software code development
 * Линейные программы
 * Задание 3. Вычислить значение выражения по формуле (все переменные принимают дейсвительные значения):
 * (sin(x)+cos(y))/(cos(x)-sin(y))*tan(x*y)
 */

public class Task_Basic_3_1 {
    public static void main(String[] args) {

        double r=0, x,y, x1,y1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Find result of (sin(x)+cos(y))/(cos(x)-sin(y))*tan(x*y)");
        System.out.println();
        System.out.println("IMPOTENT: divider between digits MUST BE LIKE \",\" but NOT LIKE \".\"");
        System.out.println();

        do{
            System.out.println("Enter x degrees:");
            x = sc.nextDouble();
            x1 = Math.toRadians(x);

            System.out.println("Enter y degrees:");
            y = sc.nextDouble();
            y1 = Math.toRadians(y);

            if(((Math.abs(x%90)+Math.abs(y%90))==0&&Math.abs((int)x/90-(int)y/90)==1)||((Math.abs(x%90)+Math.abs(y%90))==90&&(Math.abs((int)x/90-(int)y/90)==0)))
                System.out.println("Please change \"x\" or \"y\" value because of cos(x)-sin(y) = "
                        +(float)Math.cos(x1)+" - "+(float)Math.sin(y1)+" = "+((float)Math.cos(x1)-(float)Math.sin(y1))
                        + " but cannot be zero.");
        }while(((Math.abs(x%90)+Math.abs(y%90))==0&&Math.abs((int)x/90-(int)y/90)==1)||((Math.abs(x%90)+Math.abs(y%90))==90&&(Math.abs((int)x/90-(int)y/90)==0)));


        if(((Math.abs(x%90)+Math.abs(y%90))!=0&&Math.abs((int)x/90-(int)y/90)==1)||((Math.abs(x%90)+Math.abs(y%90))!=90&&(Math.abs((int)x/90-(int)y/90)==0)))
            r=(Math.sin(x1)+Math.cos(y1))/(Math.cos(x1)-Math.sin(y1)*Math.tan(x1*y1));
        System.out.println("Result is "+r);


    }
}
