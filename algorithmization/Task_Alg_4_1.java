package algorithmization;

/**
 * Даны действительные числа a1,a2,...,an.
 * Поменять местами наибольший и наименьший элементы.
 *
 */
public class Task_Alg_4_1 {
    public static void main(String[] args) {
        double[] a = {0,256,-2,3.68,257,-26.58};
        int minPos = 0, maxPos = 0;
        double min = 0, max = 0;

        //Long start = System.currentTimeMillis();
/*
        double[] a = new double[10000000];
        for(int i =0;i<a.length;i++){
            a[i] = -100+(int)(Math.random()*200)+(double)((int)(Math.random()*100000))/100000;
        }
*/
/*
        for(int i=0; i<a.length-1; i++){
            if(a[i] < a[i+1] && min>a[i]){
                min = a[i];
                minPos = i;
            }
            if(a[i] > a[i+1] && min>a[i+1]){
                min = a[i+1];
                minPos = i+1;
            }
            if(a[i] > a[i+1] && max<a[i]){
                max = a[i];
                maxPos = i;
            }
            if(a[i] < a[i+1] && max<a[i+1]){
                max = a[i+1];
                maxPos = i+1;
            }
        }
*/
        for(int i=0; i<a.length-1; i++) {
            if (a[i] < a[i + 1]) {
                if(min > a[i]) {
                    min = a[i];
                    minPos = i;
                }
                if(max<a[i+1]) {
                    max = a[i+1];
                    maxPos = i+1;
                }
            }
            else{
                if(min > a[i+1]) {
                    min = a[i+1];
                    minPos = i+1;
                }
                if(max<a[i]) {
                    max = a[i];
                    maxPos = i;
                }
            }
        }

        a[minPos] = max;
        a[maxPos] = min;


        for(double d:a)System.out.println(d);
        System.out.println();
        System.out.println("min: "+min + ", max: " + max);

        //Long end = System.currentTimeMillis();
        //System.out.println(end-start);                //время выполнения
    }
}

