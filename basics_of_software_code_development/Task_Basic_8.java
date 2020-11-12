package basics_of_software_code_development;

/**
 * Найти max{min(a,b),min(c,d)}
 *
 *
 */

public class Task_Basic_8 {
    public static void main(String[] args) {
        double a,b,c,d;
        a=20;
        b=15;
        c=65;
        d=85.65;

        System.out.println("Max{min("+a+","+b+"),min("+c+","+d+")="+Math.max(Math.min(a,b),Math.min(c,d)));

    }


}
