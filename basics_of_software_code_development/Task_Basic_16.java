package basics_of_software_code_development;

/**
 * Даны числовой ряд и некоторое число е.
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному числу е.
 * Общий член рядя имеет вид:
 * an=1/2^n+1/3^n
 *
 */
public class Task_Basic_16 {
    public static void main(String[] args) {
        int n=1000000;
        double sum=0, a=0, e = 0;

        for(int i=0; i<n; i++){
            a=Math.abs(1/Math.pow(2,i)+1/Math.pow(3,i));
            if(a>=e)sum+=a;
        }

        System.out.println(sum);


    }
}
