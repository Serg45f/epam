package com.epam.oopintro;

import java.util.*;

/**
 * Ввести с консоли n целых чисел. На консоль вывести:
 * 1. Четные и нечетные числа.
 * 2. Наибольшее и наименьшее число.
 * 3. Числа, которые делятся на 3 или на 9.
 * 4. Числа, которые делятся на 5 и на 7.
 * 5. Элементы, расположенные методом пузырька по убыванию модулей.
 * 6. Все трехзначные числа, в десятичной записи которых нет одинаковых
 * цифр.
 * 7. Наибольший общий делитель и наименьшее общее кратное этих чисел.
 * 8. Простые числа.
 * 9. Отсортированные числа в порядке возрастания и убывания.
 * 10. Числа в порядке убывания частоты встречаемости чисел.
 * 11. «Счастливые» числа.
 * 12. Числа Фибоначчи: f0 = f1 = 1, f (n) = f (n–1) + f (n–2).
 * 13. Числа-палиндромы, значения которых в прямом и обратном порядке совпа-
 * дают.
 * 14. Элементы, которые равны полусумме соседних элементов.
 * 15. Период десятичной дроби p = m/n для первых двух целых положительных
 * чисел n и m, расположенных подряд.
 * 16. Построить треугольник Паскаля для первого положительного числа.
 */

public class B_OperationsWithNumbers {
    public static void main(String[] args) {
        int[] array = new int[30];

        fillArray(array,1000);

        System.out.println(array[10]);
        System.out.println(array[10]/100);
        System.out.println((array[10]-array[10]/100*100)/10);
        System.out.println((array[10]-array[10]/100*100)-(array[10]-array[10]/100*100)/10*10);

        System.out.println(Arrays.toString(OperationsWithIntegers.primesArray(30)));


        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(OperationsWithIntegers.evenNumbersF(array)));
        System.out.println(Arrays.toString(OperationsWithIntegers.oddNumbersF(array)));
        System.out.println(OperationsWithIntegers.maxNumbersF(array));
        System.out.println(OperationsWithIntegers.minNumbersF(array));
        System.out.println(Arrays.toString(OperationsWithIntegers.divBy3_Or_9F(array)));
        System.out.println(Arrays.toString(OperationsWithIntegers.divBy5_And_7F(array)));
        System.out.println(Arrays.toString(OperationsWithIntegers.bubleSortAscF(array)));
        System.out.println(Arrays.toString(OperationsWithIntegers.bubleSortDesc(array)));
        System.out.println(Arrays.toString(OperationsWithIntegers.threeRankNumbers(array)));
        System.out.println(Arrays.toString(OperationsWithIntegers.lessCommonDivisorArr(OperationsWithIntegers.threeRankNumbers(array))));
        OperationsWithIntegers.lessCommonDivisor(OperationsWithIntegers.threeRankNumbers(array));



    }
    private static void fillArray(int[] arr, int rankSize){
        for(int i =0; i<arr.length;i++){
            arr[i] = (int)(Math.random()*rankSize);
        }
    }
}

class OperationsWithIntegers{
 //Even integers
    public static int[] evenNumbers (int[] intArray){
        int countEven = 0;
        for(int i:intArray){
            if(i%2==0)countEven++;
        }
        int[] arr = new int[countEven];
        countEven=0;

        for(int i:intArray){
            if(i%2==0){
                arr[countEven] = i;
                countEven++;
            }
        }
        return arr;
    }

    public static int[] evenNumbersF (int[] intArray){
        return Arrays.stream(intArray).filter(v->v%2==0).toArray();
    }
    //Odd integers
    public static int[] oddNumbersF (int[] intArray){
        return Arrays.stream(intArray).filter(v->v%2!=0).toArray();
    }

    //MAX of integers
    public static int maxNumbersF (int[] intArray){
        //return Arrays.stream(intArray).reduce((acc,a)->acc=Math.max(acc,a)).getAsInt();
        return Arrays.stream(intArray).max().getAsInt();
    }

    //MIN of integers
    public static int minNumbersF (int[] intArray){
        //return Arrays.stream(intArray).reduce((acc,a)->acc=Math.min(acc,a)).getAsInt();
        return Arrays.stream(intArray).min().getAsInt();
    }

    //Divided by 3 OR 9 integers
    public static int[] divBy3_Or_9F (int[] intArray){
        return Arrays.stream(intArray).filter(v->(v%3==0||v%9==0)).toArray();
    }
    //Divided by 5 AND 7 integers
    public static int[] divBy5_And_7F (int[] intArray){
        return Arrays.stream(intArray).filter(v->(v%5==0&&v%7==0)).toArray();
    }
    //BubleSort asc
    public static int[] bubleSortAscF(int[] intArray){
        return Arrays.stream(intArray).sorted().toArray();
    }
    //BubleSort desc
    public static int[] bubleSortDesc(int[] intArray){
        Integer[] arr = new Integer[intArray.length];
        for(int i=0;i<intArray.length;i++)arr[i]=intArray[i];
        Arrays.sort(arr,0,intArray.length,(a1,a2)->{
            if(a2>a1) return 1;
            else if(a2<a1) return -1;
            else return 0;
        });
        return Arrays.stream(arr).mapToInt(a->a).toArray();
    }

    //3rankNumbers
    public static int[] threeRankNumbers(int[] intArray){

        return Arrays.stream(intArray)
                .filter(a->
            a/100!=0 &&
                    a/100!=(a-a/100*100)/10 &&
                    a/100!= (a-a/100*100)-(a-a/100*100)/10*10 &&
                    (a-a/100*100)/10!=(a-a/100*100)-(a-a/100*100)/10*10
            )
                .toArray();
    }

    //НОД
    public static int[] lessCommonDivisorArr(int[] intArray){
        List<Integer> listLCD = new ArrayList<>();
        int lcd=0;
        for(int i = 0; i<intArray.length-1;i++){
            listLCD.add(algEvclid(intArray[i], intArray[i+1]));
        }
        int[] arr = new int[listLCD.size()];
        return listLCD.stream().mapToInt(a->a).toArray();
    }

    public static int algEvclid(int a, int b){
        if(b==0){
            return a;
        }
         return algEvclid(Math.min(a,b),Math.max(a,b)%Math.min(a,b));
    }

    public static int lessCommonDivisor(int[] intArray){
        Map<Integer,List<Integer>> mapOfLCD = new HashMap<>();

        for(int i = 0;i<intArray.length;i++){
            int a = intArray[i];
            int primesQuantity = 200;
            int[] primes = primesArray(primesQuantity);
            int k = 0;
            List<Integer> list = new ArrayList<>();
            while(a!=0&&k<primesQuantity){
                int pq = primesArray(primesQuantity)[k];
                if (a%pq==0) {
                    a = a / pq;
                    list.add(pq);
                }else
                k++;
            }
            mapOfLCD.put(intArray[i],list);
            k=0;
        }

        for (Map.Entry<Integer,List<Integer>> entry:mapOfLCD.entrySet()) {
            System.out.print(entry.getKey()+" ");
            for(Integer i:entry.getValue()){

                System.out.print(" " + i);
            }
            System.out.println();
        }
        return 1;
    }

    public static int[] primesArray(int quantity){
        List<Integer> numbers = new ArrayList<>();
        int currentNumber = 2;
        int primesFound = 0;
        while(numbers.size()<quantity){
                if (isPrime(currentNumber)) {
                    primesFound++;
                    numbers.add(currentNumber);
                }
                currentNumber++;
            }
        return numbers.stream().mapToInt(a->a).toArray();
    }

    public static boolean isPrime(int x)
    {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }


}

