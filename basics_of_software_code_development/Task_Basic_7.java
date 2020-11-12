package basics_of_software_code_development;

/**
 * Даны два угла теругольника (в градусах).Определить,
 * существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 *
 */
public class Task_Basic_7 {
    public static void main(String[] args) {
        double a,b,c;
        a=179;
        b=0.5;
        c=180-a-b;
        if(a==90||b==90||c==90) System.out.println("Углы треугольника: "+a+", "+b+", "+c+" градусов. Он ПРЯМОУГОЛНЫЙ.");
        else if (a>=180||b>=180||c>=180) System.out.println("Это не треугольник)");
        else System.out.println("Углы треугольника: "+a+", "+b+", "+c+" градусов. Он НЕ прямоугольный.");

    }
}
