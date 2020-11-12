package com.epam.oopintro;

public class A5_ConsoleNumbers {
    public static void main(String[] args) {
        int sum=0;
        for(String str:args){
            sum+=Integer.parseInt(str);
        }
        System.out.println(sum);
    }

}
