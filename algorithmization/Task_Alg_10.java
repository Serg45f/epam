package algorithmization;

/**
 * Дан целочисленный массив с количеством элемнтов n.
 * Сжать массив, выбросив из него каждый второй элемент(освободившиеся элементы заполнить нулями)
 * примечание: дополнительный массив не использовать.
 *
 */

public class Task_Alg_10 {
    public static void main(String[] args) {
        final int n = 100;
        int[] a = new int[n];

        for (int i = 0; i<a.length;i++){
            a[i] = (int)(Math.random()*100);
        }

        for(int x:a) System.out.print(x+" ");

        for (int i = 0; i<a.length;i++){
            if(i%2!=0)a[i] = 0;
        }

        System.out.println();
        for(int x:a) System.out.print(x+" ");
    }
}
