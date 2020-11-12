package algorithmization;

/**
 * Даны действительные числа a1, a2, ... , an.
 * Найти max(a1 + an, a2 + an-1, + ... +, an + an+1).
 *
 */

public class Task_Alg_7 {
    public static void main(String[] args) {
        int n = 20;
        double[] a = new double[2*n];
        double max=-100;

        for(int i = 0;i<a.length;i++){
            a[i] = -100+(int)(Math.random()*200)+(double)((int)(Math.random()*100000))/100000;
        }

        for(double x:a) System.out.println(x);

        System.out.println();

        for(int i = 0,j=2*n-1;i<n&&j>=0;i++,j--){
            System.out.println("a["+i+"] + a["+j+"] = "+ a[i] + " + " + a[j]+ " = " + (a[i]+a[j]));
            if(max<a[i]+a[j]) max=a[i]+a[j];
        }
        System.out.println("\n max = "+max);
    }

}
