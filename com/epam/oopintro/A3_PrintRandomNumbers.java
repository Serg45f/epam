package com.epam.oopintro;

/**
 * Вывести заданное количество случайных чисел с переходом и без перехода
 * на новую строку.
 */
public class A3_PrintRandomNumbers {
    public static void main(String[] args) {
        int quantity = 10;
        for(int i = 0;i<quantity;i++){
            System.out.print((int)(Math.random()*10)+" ");
        }
        System.out.println();
        for(int i = 0;i<quantity;i++){
            System.out.println((int)(Math.random()*10));
        }
    }
}
