package algorithmization;

import java.util.ArrayList;
import java.util.List;

/**
 *  Дана последовательность N вещественных чисел. Вычислить сумму чисел,
 * порядковые номера котрых являются простыми числами.

 */

public class Task_Alg_6 {
    public static void main(String[] args) {
        final int n = 50;
        double[] a = new double[n];
        List<Integer> list = new ArrayList<>();
        double sum = 0;

        for(int i = 0;i<a.length;i++){
            a[i] = -100+(int)(Math.random()*200)+(double)((int)(Math.random()*100000))/100000;
        }

        for (int i = 0; i<a.length;i++){
            for(int j = 1;j<=i;j++){
                if(i%j==0){
                    list.add(j);
                }
            }

            if(list.size()>=1&&list.size()<=2){
                System.out.println("i = "+i);
                sum=sum+a[i];
            }
            list.clear();
        }
        System.out.println();
        for(double x:a) System.out.println(x);
        System.out.println();
        System.out.println("Сумма ="+sum);

    }
}
