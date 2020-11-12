package algorithmization;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 * Если таких чисел несколько, то определить наименьшее из них.
 */
public class Task_Alg_9 {
    public static void main(String[] args) {
        final int n = 100;
        int[] a = new int[n];
        int minOfMax = 100, maxQuantity = 0;
        Map<Integer,Integer> repeatedNumbers = new HashMap<>();
        Set<Map.Entry<Integer,Integer>> numbers;

        for(int i=0;i<a.length;i++){
            a[i] = (int)(Math.random()*100);
        }

        for(int x:a) System.out.print(x+" ");
        System.out.println();
        boolean isInList = false;

        for(int i =0;i<a.length;i++){
            if(!repeatedNumbers.isEmpty()){
                numbers = repeatedNumbers.entrySet();
                for(Map.Entry<Integer,Integer> number:numbers){
                    if(number.getKey().equals(a[i])){
                        number.setValue(number.getValue()+1);
                        isInList=true;
                    }
                }
                if(!isInList)repeatedNumbers.put(a[i],1);
                isInList=false;

            }
            else repeatedNumbers.put(a[i],1);
        }

        numbers = repeatedNumbers.entrySet();
        for(Map.Entry<Integer,Integer> number:numbers){
            System.out.println(number.getKey()+", "+number.getValue());
            if(maxQuantity<number.getValue())maxQuantity=number.getValue();

        }
        for(Map.Entry<Integer,Integer> number:numbers){
            if(number.getValue().equals(maxQuantity) && minOfMax>number.getKey())minOfMax=number.getKey();
        }
        System.out.println(minOfMax +" "  + maxQuantity);

    }
}
