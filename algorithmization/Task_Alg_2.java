package algorithmization;

/**
 * Дана последовательность действительных чисел a1, a2, ..., an.
 * Заенить все ее члены, большие данного z, этим числом.
 * Подсчитать количество замен.
 */
public class Task_Alg_2 {
    public static void main(String[] args) {
        int z = 65, count = 0;
        int[] a = new int[100];

        for(int i=0;i<a.length;i++){
            a[i]=i*3;
        }
        for (int x:a) System.out.println(x);

        for(int i=0;i<a.length;i++){    //  работает
            if (a[i] >= z) {
                a[i] = z;
                count++;
            }
        }
      /*
        for (int x:a) {                 // не работает
            if (x >= z) {
                x = z;
                count++;
            }
        }

       */
        for (int x:a) System.out.println(x);
        System.out.println(count + " замен");
    }
}
