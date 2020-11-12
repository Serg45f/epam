package algorithmization;

/**
 * Дан массив действительных чиесел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов
 *
 */
public class Task_Alg_3 {
    public static void main(String[] args) {
        final int n = 100;
        int[] a = new int[n];

        //Заполняем массив случайными числами от 0 до 100
        for(int i = 0;i<a.length;i++){
            a[i] = (int)(Math.random()*100);
        }

        //меняем 1/10 элементов знак
        for(int i = 0;i<n/10;i++){
            a[(int)(Math.random()*100)] *=-1;
        }

        //выводим получившийся массив на экран
        for(int x:a) System.out.print(x+" ");

        //подсчитываем элементы
        countArrayElems(a);
    }

    public static void countArrayElems(int[] arr){
        int pos = 0, neg = 0, zero = 0;

        for(int x:arr){
            if(x>0)pos++;
            else if(x==0)zero++;
            else neg++;
        }

        System.out.println();
        System.out.println("В данном массиве:");
        System.out.println("положительных элементов: "+pos);
        System.out.println("нулевых элемнетов: " + zero);
        System.out.println("отрицательных элементов:" + neg);
    }
}
