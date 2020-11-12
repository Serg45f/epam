package algorithmization;

import java.util.ArrayList;
import java.util.List;

/**
 * Дана последовательность целых чисел a1, a2, ..., an.
 * Образовать новую последовательность, выбросив из исходной те члены,
 * которые равны min(a1, a2, ..., an);
 */

public class Task_Alg_8 {
    public static void main(String[] args) {

        int[] a = new int[200];
        List<Integer> list = new ArrayList<>();

        int min = 100;

        for(int i = 0;i<a.length;i++){
            a[i] = -100+(int)(Math.random()*200);
        }

        for(int x:a) System.out.print(x+" ");
        System.out.println();

        for(int x:a)if(min>x)min=x;

        for(int i =0;i<a.length;i++) if(a[i]!=min) list.add(a[i]);

        for(int x:list) System.out.print(x+" ");
        System.out.println("\nNumber of elements of a new sequence  is " + list.size());
    }
}
