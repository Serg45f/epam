package basics_of_software_code_development;

import java.util.ArrayList;
import java.util.List;

/**
 * Вычислить значения функции на отрезке [a,b] с шагом h:
 *
 * y = {x, x>2; -x, x<=2}
 *
 */
public class Task_Basic_13 {
    public static void main(String[] args) {
        double a,b,h;
        a=5;
        b=20;
        h=1.1;

        List<Double> yList = new ArrayList<>();

        for(double x = a;x<=b;x+=h){
            if(x<=2)yList.add(-x);
            else yList.add(x);
        }

        for (double d:yList) System.out.println(d);

    }
}
