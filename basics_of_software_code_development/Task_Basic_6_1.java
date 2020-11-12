package basics_of_software_code_development;

import java.util.Scanner;
/**
 * Basic of software code development
 * Линейные программы
 * Задание 6. Для данной области составить линейную программу, которая печатает true,
 * если точка с координатами (x,y) принадлежит закрашенной обласи, и false - в противном случае.
 */

public class Task_Basic_6_1 {
    public static void main(String[] args) {

        int x,y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input x: ");
        x= sc.nextInt();
        System.out.println("Input y: ");
        y= sc.nextInt();

        if(x>=-2 && x<=2 && y>=0 && y<=4  || x>=-4 && x<=4 && y>=-3 && y<=0) System.out.println(true);
        else System.out.println(false);
    }


}
