package algorithmization;

/**
 * Даны целые числа a1,a2,...,an.
 * Вывести на печать только числа для которых ai>i.
 *
 */
public class Task_Alg_5 {
    public static void main(String[] args) {

        int[] a = new int[100];
        for(int i =0;i<a.length;i++){
            a[i] = (int)(Math.random()*100);
        }

        for(int i=0; i<a.length; i++){
            if(a[i] > i) System.out.println(a[i]);

        }
    }
}

